package javasample;
import java.util.*;
public class LargeEle{
public static void main(String[] args)
{
int a[]={20,45,67,56,78};
int b[]={34,67,56,89,90};
System.out.println("Large Ele: "+largeElem(a,5));
System.out.println("Large Ele: "+largeElem(b,5));
}
public static int largeElem(int a[],int total)
{
Arrays.sort(a);
return a[total-1];
}
}