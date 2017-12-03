package javasample;
public class selectionsort{
public static void main(String[] args)
{
int arr[]={20,50,30,40,70,30,90};
System.out.println("Before selection sort");
for(int i=0;i< arr.length;i++){
System.out.print(" "+arr[i]);
}
System.out.println();
selection(arr);
{
System.out.println("After selection sort");
for(int i=0;i< arr.length;i++){
System.out.print(" "+arr[i]);
}
}
}
static void selection(int arr[]){
for(int i=0;i<arr.length-1;i++)
{
int index=i;
for(int j=i+1;j<arr.length;j++)
{
if(arr[j]<arr[index])
{
index=j;
}
}
int smallEle=arr[index];
arr[index]=arr[i];
arr[i]=smallEle;
}
}
}