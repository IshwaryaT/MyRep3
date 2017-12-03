package javasample;
import java.util.Arrays;
public class Thirdlargearrays{
public static void main(String[] args)
{
int a[]={23,34,56,67,78};
int b[]={25,55,75,65,45};
System.out.println("Third large Ele: "+ TArrays(a,5));
System.out.println("Third large Ele: "+ TArrays(b,5));
}
public static int TArrays(int[] a,int total){
Arrays.sort(a);
return a[total-3];
}
}
