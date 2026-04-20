import java.util.Scanner;

class Area
{
double pi=3.14;
void area(int side)
{
System.out.println("Area of square:"+(side*side));
}

void area(double length,double breadth)
{
System.out.println("Area of rectangle:"+(length*breadth));
}

void area(double radius)
{
System.out.println("Area of circle:"+(pi*radius*radius));
}
}

public class AreaOverloading
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
Area ar=new Area();

System.out.println("Enter the side of square:");
int side=sc.nextInt();


System.out.println("Enter the length of rectangle:");
double length=sc.nextDouble();
System.out.println("Enter the breadth of rectangle:");
double breadth=sc.nextDouble();

System.out.println("Enter the radius of circle:");
double radius=sc.nextDouble();

System.out.println("\nArea of shapes are given below\n:");
ar.area(side);
ar.area(length,breadth);
ar.area(radius);
}
}



