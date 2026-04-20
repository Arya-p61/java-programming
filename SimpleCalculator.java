import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener{
Label l1,l2,result;
TextField t1,t2;
Button add,sub,mul,div;

SimpleCalculator(){
l1=new Label("Enter first number :");
l2=new Label("Enter second number :");
t1=new TextField();
t2=new TextField();


add=new Button("Add");
sub=new Button("Subtract");
mul=new Button("Multiplication");
div=new Button("Division");

result=new Label("Result: ");

setLayout(new GridLayout(6,2));
add(l1); add(t1);
add(l2); add(t2);

add(add); add(sub);
add(mul); add(div);

add(result);

add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);


addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
dispose();
}

});

setSize(350,250);
setVisible(true);
}


public void actionPerformed(ActionEvent e){

try{
double a=Double.parseDouble(t1.getText());
double b=Double.parseDouble(t2.getText());

double c;

if(e.getSource()==add){
c=a+b;
result.setText("Result: "+c);
}

else if(e.getSource()==sub){
c=a-b;
result.setText("Result: "+c);
}

else if(e.getSource()==mul){
c=a*b;
result.setText("Result: "+c);
}

else{
if(b!=0){
c=a/b;
result.setText("Result: "+c);
}

else{
result.setText("can't divide by zero");
}
}
}
catch(Exception ex){
result.setText("Invalid Input");
}
}
public static void main(String args[]){
new SimpleCalculator();
}
}

