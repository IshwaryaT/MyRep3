package javasample;
import java.util.*;
public class SecsmallEle{
public static void main(String[] args)
{
int a[]={20,45,67,56,78};
int b[]={34,67,78,56,89};
System.out.println("Second small Ele: "+SecElem(a,5));
System.out.println("Second small Ele: "+SecElem(b,5));
}
public static int SecElem(int a[],int total)
{
Arrays.sort(a);
return a[1];
}
}