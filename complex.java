import java.util.Scanner;
class complex
{
int real,image;
complex(int r,int i)
{
	real=r;
	image=i;
}


public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real and imaginary part of first number:");
int r1=sc.nextInt();
int i1=sc.nextInt();

System.out.println("Enter the real and imaginary part of second number:");
int r2=sc.nextInt();
int i2=sc.nextInt();

complex c1=new complex(r1,i1);
complex c2=new complex(r2,i2);

int realsum=c1.real+c2.real;
int imagesum=c1.image+c2.image;

System.out.println("Result:"+realsum+"+i "+imagesum);
}
}
