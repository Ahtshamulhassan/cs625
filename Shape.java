class TwoDShape{
double width;
double height;
void showDim(){
System.out.println("width and height are "+ width+" and'+ height);
}
}
class Triangle extends TwoDShape{
string style;
double area()
return width*height/2;
}
void showStyle(){
System.out.println("{Triangle is "+style);
}
}
class Shape{
public static void main(String args[]){
Triangle t1=new Triangle();
Triangle t2=new Triangle();

t1.width=4.0;
t1.height=4.0;
t1.style="filled;

t2.width=8.0;
t2.height=12.0;
t2.style=outlined;

System.out.println("info for t1:");
t1.showstyle();
t1.showDim();
System.out.println("Area is" +t1.area());

System.out.println();

System.ou.println("info for t2:");
t2.showStyle();
t2.showDim();
System.out.println("Area is " +t2.area());
}
}

