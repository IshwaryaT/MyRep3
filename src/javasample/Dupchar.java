package javasample;

import java.util.HashMap;
import java.util.Set;

public class Dupchar {
	public static void finddup(String str){
	
	HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
	char[] c=str.toCharArray();
	for(Character ch:c){
		if(hs.containsKey(ch)){
			hs.put(ch,hs.get(ch)+1);
		}
		else{
			hs.put(ch, 1);
		}
	}
	Set<Character> keys=hs.keySet();
	for(Character ch:keys){
		if(hs.get(ch)>1){
			System.out.println(ch+"Repeted"+hs.get(ch)+"times");
		}
		
	}
	}
	
public static void main(String[] args){
	Dupchar dup=new Dupchar();
	dup.finddup("The legal legal central");
}
}
