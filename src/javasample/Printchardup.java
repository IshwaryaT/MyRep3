package javasample;

public class Printchardup {
	public static void main(String[] args){
		Printchardup dup=new Printchardup();
		char arr[]={'a','b','c','d','f','g','c','a','b'};
		int length=arr.length;
		dup.printDup(arr,length);
		
	}
	public static void printDup(char arr[],int length){
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(arr[i]==(arr[j])){
					System.out.println(arr[i]+"");
					
				}
				
			}
		}
	}
}