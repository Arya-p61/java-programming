import java.util.Scanner
class cpu
{
int price;
cpu(int price)
{
this.price=price;
}
class processor
{
int cores;
String manufactures;
processor(int cores,String manufactures)
{
this.cores=cores;
this.manufactures=manufactures
}
void display processor()
{
System.out.println("processor cores:"+cores);
System.out.println("processor manufactures:"+manufactures);
}
}
static class RAM
{
int memory;
String manufactures;
RAM(int memory,String manufactures)
{
this.memory=memory;
this.manufactures=manufactures;
}
void display RAMINFO()
{
System.out.println("RAM memory:"+memory+"GB"));
System.out.println("RAM manufactures:"+manufactures);
}
}
public static void main(String[]args)
{
cpu cp=new cpu(45,000);
System.out.println("cpu price:"+cp.price);
cpu.processor processor=cp.new processor(8."intel");
cpu.ram ram=new cpu.RAM(16,"corsair");
System .out.println("cpu price:"+processor cp.price);
processor.display();
ram.display RAM();
}
}


