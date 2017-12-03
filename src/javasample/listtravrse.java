package javasample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listtravrse {
public static void main(String[] args){
	List<String> lis1=new ArrayList<String>();
	lis1.add("Meena");
	lis1.add("Mega");
	lis1.add("Lisa");
for(String a:lis1){
	System.out.println(a);
}
	List<String> lis2=new LinkedList<String>();
	lis2.add("meena");
	lis2.add("Mega");
	lis2.add("Siva");
	System.out.println("Before list"+lis2);
	lis2.remove("Siva");
	System.out.println("After the remove list"+lis2);
	lis2.set(0, "Jina");
	System.out.println("After the set  list"+lis2);
	
}
}
