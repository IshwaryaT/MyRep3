package javasample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemovedupArryl {
	public static void main(String[] args){
		List<String> lis=new ArrayList<String>();
		lis.add("Meena");
		lis.add("Mega");
		lis.add("Meena");
		lis.add("Nisha");
		lis.add("Karan");
        System.out.println("With duplicate"+lis.toString());
		Set<String> set=new LinkedHashSet<String>(lis);
		System.out.println("without duplicates"+set);
		
		
	}

}
