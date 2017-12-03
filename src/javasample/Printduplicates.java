package javasample;

import java.util.ArrayList;
import java.util.List;

public class Printduplicates {
	public static void main(String[] args){
		Printduplicates repeat=new Printduplicates();
		int arr[]={4, 2, 4, 5, 2, 3, 1};
		int length=arr.length;
		repeat.printDuplicates(arr,length);
		
		
	}
	public static void printDuplicates(int arr[],int length){
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]+"");
				}
			}
		}
	   
		


}
}