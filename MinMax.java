class MinMax{
public static void main(String args[]){
int arr[]=new int[10];
int min,max;
arr[0]=99;
arr[1]=-10;
arr[2]=100123;
arr[3]=18;
arr[4]=-978;
arr[5]=5623;
arr[6]=463;
arr[7]=-9;
arr[8]=287;
arr[9]=49;
min=max=arr[0];
for(int i=0;i<10;i++){
if(arr[i]< min) min=arr[i];
if(arr[i]> max) max=arr[i];
}
System.out.println("min and max" +min+" "+max);
}
}