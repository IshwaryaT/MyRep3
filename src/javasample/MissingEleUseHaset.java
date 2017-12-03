package javasample;

import java.util.HashSet;
import java.util.Set;

public class MissingEleUseHaset {
	
	public static void missingEle(int arr[],int low,int high){
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
		hs.add(arr[i]);
		}
		for(int i=0;i<=high;i++){
			if(!hs.contains(i)){
				System.out.println(i+"");
			}
		}
		
	}
	
	public static void main(String[] args){
		int arr[]={1,4,6,2,6,9,10};
		int low=1;
		int high=10;
		missingEle(arr,low,high);
				
	}

}

