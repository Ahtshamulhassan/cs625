class MinMax1{
public static void main(String args[]){
int arr[]={99,-10,100123,18,-978,5623,463,-9,278,49};
int min,max;
min=max=arr[0];
for(int i=0;i<10;i++){
if(arr[i]< min) min=arr[i];
if(arr[i]> max) max=arr[i];
}
System.out.println("min and max" +min+" "+max);
}
}