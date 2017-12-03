package javasample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseUsingArraylis {
	public static void main(String[] args){
		List<String> lis=new ArrayList<String>();
		lis.add("Meena");
		lis.add("Mega");
		lis.add("Snekha");
		System.out.println("Before reversing"+lis);
		Collections.reverse(lis);
		System.out.println("After reversing"+lis);
		List<Integer> lis1=new ArrayList<Integer>();
		lis1.add(200);
		lis1.add(300);
		lis1.add(400);
		System.out.println("Before reversing"+lis1);
		Collections.reverse(lis1);
		System.out.println("After reversing"+lis1);
		
	}

}
