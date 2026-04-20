import java.util.Scanner;
class product
{
int pcode;
String pname;
double price;
product(int code,String name,double pr)
{
pcode=code;
pname=name;
price=pr;
}
void display()
{
System.out.println("product code:"+pcode);
System.out.println("product name:"+pname);
System.out.println("product price:"+price);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the details of product 1");
int c1=sc.nextInt();
String n1=sc.next();
double p1=sc.nextDouble();
 
System.out.println("Enter the details of product 2");
int c2=sc.nextInt();
String n2=sc.next();
double p2=sc.nextDouble();

System.out.println("Enter the details of product 3");
int c3=sc.nextInt();
String n3=sc.next();
double p3=sc.nextDouble();

product prod1=new product(c1,n1,p1);
product prod2=new product(c2,n2,p2);
product prod3=new product(c3,n3,p3);

product lowest=prod1;

if(prod2.price<lowest.price)
lowest=prod2;

if(prod3.price<lowest.price)
lowest=prod3;

System.out.println("\n product with lowest price:");
lowest.display();
}
}


