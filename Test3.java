import java.util.Scanner;
class Test3
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int sal,b;
System.out.println("Enter your sallery");
 sal=obj.nextInt();
if(sal>=10000)
{
b=(sal*10)/100;
sal=sal+b;
}
else
{
b=(sal*5)/100;
sal=sal+b;
}
System.out.println("your sallery is" + sal);
}
}