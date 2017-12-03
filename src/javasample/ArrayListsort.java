package javasample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListsort {
	public static void main(String[] args){
		List<Integer> lis=new ArrayList<Integer>();
		lis.add(10);
		lis.add(30);
		lis.add(40);
		lis.add(20);
		lis.add(10);
		lis.add(20);
		System.out.println("Before Sorting"+lis);
		Collections.sort(lis);
		System.out.println("After Sorting"+lis);
		Collections.reverse(lis);
		System.out.println("Descending order"+lis);
		List<String> lis1=new ArrayList<String>();
		lis1.add("Meena");
		lis1.add("Jana");
		lis1.add("Abi");
		lis1.add("Ishu");
		
		System.out.println("Before Sorting"+lis1);
		Collections.sort(lis1);
		System.out.println("After Sorting"+lis1);
		Collections.reverse(lis1);
		System.out.println("Descending order"+lis1);
		
	}

}
