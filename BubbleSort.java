class BubbleSort{
public static void main(String args[]){
int arr[]={99,-10,100123,18,-978,5623,463,-9,278,49};
int i,j,t;
size=10;
System.out.print("Orignal array is:");
for(int i=0;i<size;i++)
System.out.print(" "+ arr[i]);
System.out.print();
int temp;
for(int i=0;i<=10;i++)
for(int j=0;j<=10.lenget-i;j++){
if(arr[j]>arr[j+1]){
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
for(int i=0;i<=10.length;i++)
System.out.println(arr[i]+" ");
}
}