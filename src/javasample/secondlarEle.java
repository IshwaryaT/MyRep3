package javasample;
public class secondlarEle{
public static void main(String[] args)
{
int a[]={20,34,56,67,78};
int b[]={23,67,89,80,45};
System.out.println("Second Large Ele: "+secondlargeEle(a,5));
System.out.println("Second Large Ele: "+secondlargeEle(b,5));
}
public static int secondlargeEle(int a[],int total)
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
return a[total-2];
}

}