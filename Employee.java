import java.util.scanner;
class Employee
{
int empno,salary;
String empno;
Employee(int no,string name,int sal)
{
empno=no;
empname=name;
salary=sal;
}
void display()
{
System.out.println("Employee number:"+empno+"\n Employee name:"+empname+"\n salary:"+salary);
}
}

public class EmployeeSearch
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of employee:");
sc.nextLine();

Employee[]emp=new Employee[n+1];
for(int i=1;i<n;i++)
{
System.out.println("Enter the details of employee"+i);

System.out.println("Emp_no");
int no=sc.nextInt();

System.out.println("Emp_name");
string name=sc.next();
sc.nextLine();

System.out.println("salary");
int sal=sc.nextInt();

emp[i]=new Employee(no,name,sal);
}
System.out.print("Enter the emp_no to search:");
int key=sc.nextInt();
int found=0;

for(int i=1;i<n;i++)
{
if(emp[i].empno==key)
{
System.out.println("Employee is found,the details is given below");
emp[i].display();
found=1;
break;
}
}
if(found==0)
{
System.out.println("Employee is not found");
}
}
}
