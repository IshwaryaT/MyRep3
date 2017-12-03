package javasample;
public class fact{
public static void main(String[] args){
int fact=1,i;
int number=5;
for(i=1;i<=number;i++){
fact=fact*i;
}
System.out.println("The fact no is " + fact);
}
}