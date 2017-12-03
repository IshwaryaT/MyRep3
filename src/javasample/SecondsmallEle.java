package javasample;
import java.util.*;
public class SecondsmallEle{
public static void main(String[] args)
{
int a[]={20,45,67,56,78};
int b[]={34,67,78,56,89};
System.out.println("Second small Ele: "+SecElem(a,5));
System.out.println("Second small Ele: "+SecElem(b,5));
}
public static int SecElem(int a[],int total)
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
return a[1];
}
}