package miscellaneous;

import java.util.Arrays;

public class chocolateDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {12, 4, 7, 9, 2, 23, 25, 41,
                30, 40, 28, 42, 30, 44, 48, 
                43, 50};
		int m=7;
		
		Arrays.sort(arr);
		
		int n=arr.length;
		int sum=Integer.MAX_VALUE; 
		int min;
		for(int i=0;i<=n-m;i++){
			min=arr[i+m-1]-arr[i];
			
			if(min<sum){
				sum=min;
			}
		}
		
		System.out.println(sum);
	}
	
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
		
	}


}
