import java.util.Scanner;
public class operators4
{
public static void main(String [] args)
{
String x="Sher";
String y="Locked";
Scanner s=new Scanner(System.in);
System.out.println("Enter username:");
String uuid=s.next();
System.out.println("Enter Password:");
String upwd=s.next();
if((uuid.equals(x) && upwd.equals(y)) || (uuid.equals(y) && upwd.equals(x)))
{
System.out.println("Welcom user.");
}
else
{
System.out.println("Wrong uid or password");
}
}
}