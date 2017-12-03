package javasample;
public class amstrong{
public static void main(String[] args){
int a,c=0,temp;
int n=153;
temp=n;
while(n>0){
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
System.out.println("No is amstrong");
else
System.out.println("No is not amstrong");
}
}
