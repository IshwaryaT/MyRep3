package javasample;
import java.util.*;
public class thirdEleColl{
public static void main(String[] args){
int a[]={45,33,22,88};
int b[]={12,14,22,88};
System.out.println("The third Largest"+thirdelecoll(a,4));
System.out.println("The third Largest"+thirdelecoll(b,4));
}
public static int thirdelecoll(int a[],int total)
{
List<int[]> l=Arrays.asList(a);
Collections.sort(l);
int[] element=l.get(total-3);
return element;
}
}