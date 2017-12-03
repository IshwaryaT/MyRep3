package javasample;
public class ThirdLargestElement
{
public static void main(String[] args)
{
int a[]={10,30,20,40};
int b[]={44,55,66,88,22};
System.out.println("Third largest:" + Getthirdlarge(a,4));
System.out.println("Third largest:" + Getthirdlarge(b,5));
}
public static int Getthirdlarge(int a[], int total)
{
int temp;
for(int i=0;i<total;i++)
{
for(int j=i+1;j<total;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return a[total-3];
}
}
