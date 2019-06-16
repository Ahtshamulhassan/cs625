class Block{
int a,b,c;
int Volume;
Block(int i;int j;int k){
a=i;
b=j;
c=k;
volume=a*b*c;
}
boolean sameBlock(Block ob{
if((ob.a==a)&(ob.b==b)&(ob.c==c)) return true;
else return false;
}
boolean SameVolume(block ob){
if(ob. volume==volume)return true;
else return false;
}
}
class PassOb{
public static void main(String args[]){
Block ob1=new block(10,2,5);
Block ob2=new block(10,2,5);
Block ob3=new block(4,5,5);
System.out.prinln("same dimensiopn as ob2:+ob1.sameBlock()ob2));
System.out.prinln("ob1.same dimensiopn as ob3:"+ob1.sameBlock(ob3));
System.out.prinln("ob1 same volumeas ob3:"+ob1.sameVolume(ob3));
}
}