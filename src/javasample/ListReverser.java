package javasample;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListReverser {

	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<String>();
		list.add("Meena");
		list.add("Vedha");
		list.add("ishu");
		System.out.println("The secondElement"+list.get(2));
		ListIterator<String> it=list.listIterator();
		System.out.println("Before reversing the Strings");
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("After reversing the Strings");
		while(it.hasPrevious())
		{
		System.out.println(it.previous());
		}
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		ListIterator<Integer> it1=al.listIterator();
		System.out.println("Before reversing the Integer");
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("After reversing the Integer");
		while(it1.hasPrevious()){
			System.out.println(it1.previous());
			
		}
		
		}
		}