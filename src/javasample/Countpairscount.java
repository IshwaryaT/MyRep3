package javasample;

public class Countpairscount {
	public static void main(String[] args){
	int arr[]={1,5,7,-1,5};
	int sum=6;
	countpairs(arr,sum);
	}
	
	public static void countpairs(int arr[],int sum ){
		int count=0;
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]+arr[j]==sum)
					count++;
		System.out.println(count);
		
	}

}
