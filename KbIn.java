class KbIn{
public static void main(String args[])
throws java.io.IOException{
char ch;
System.out.println("press a key followed by enter");
ch=(char) System.in.read();
System.out.print("your key is :"+ch);
}
}