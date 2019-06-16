class FailSoftArray{
private int a[];
private int errval;
public int length;
public FailSoftArray(int size,int errv){
a=new int[size];
erravel=errv;
length=size;
}
public int get(int index){
if(indexOK)) return a [index];
return errval
public boolean put(int index, int val){
if(indexOK(index)){
a[index]=val;
return true;
}
return fals
}
}
class FSDemo{
publicstatic voidb main(String args[]){
FailSoftArrayfs=new FailSoftArray(5,-1);
int x;
System.out,println("Fail quietly.");
for(int i=0;i<(fs.length*2);i++)
fs.put(i,i*10);
for(int i=0;i<(fs.length*2);i++){
x=fs.get;
if(x !=-1)System.out.print(x+ " ");
}
System.out.println(" ");
System.out.println("\nFail with error report.');
for(int i=0;i<(fs.length*2);i++)
if(!fs.put(i, i*10))
System.out.println("index" +i+" out_of_bound");
for (int i=0; i,(fs.length*2);i++){
x=fs.get(i);
if(x!=-1) System.out.print(x+" ");
else
System.out.print("index" +i+ "out-of-bound");
}
}
}
