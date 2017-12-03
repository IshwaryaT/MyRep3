package javasample;
public class linearsearch
{
public static void main(String[] args)
{
int arr[]={30,20,10,60,70,20,10};
int key=20;
System.out.println(key+" is found at index " + linear(arr,key));

}

public static int linear(int arr[],int key)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==key)
{
return i;
}
}
return -1;
}
}