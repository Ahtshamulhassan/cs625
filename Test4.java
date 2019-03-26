import java.util.Scanner;
class Test4
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int roll;
System.out.println("enter roll No");
roll=obj.nextInt();
switch(roll)
{
case 101:
System.out.println("student name: Ahtsham");
break;
case 102:
System.out.println("student name: Bilal");
break;
case 103:
System.out.println("student name: Rehan");
default:
System.out.println("Not found");
}
}
}
