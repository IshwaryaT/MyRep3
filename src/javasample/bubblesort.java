package javasample;
public class bubblesort
{
public static void main(String[] args)
{
int arr[]={50,60,40,90,20,100,10,30,70,80};
System.out.println("Before bubble Sort");
for(int i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]);
}
System.out.println();
System.out.println("After the bubblesort");
bubble(arr);
{
for(int i=0;i<arr.length;i++){
System.out.print(" "+arr[i]);
}
}
}
static void bubble(int arr[])
{
int temp=0;
int n=arr.length;
for(int i=0;i<n;i++)
{
for(int j=1;j<n-i;j++)
{
if(arr[j-1]>arr[j])
{
temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
}
}
}
}
}