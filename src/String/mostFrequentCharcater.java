package String;

public class mostFrequentCharcater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="geekhsforgeeks";
		
		System.out.println(mostFrequent(s));
		
	
	}
	
	public static char mostFrequent(String s){
		
		int index=Integer.MIN_VALUE;
		
		int NO_OF_CHARS = 256; 
		
		int arr[] = new int[NO_OF_CHARS]; 
		
		for(int i=0;i<NO_OF_CHARS;i++){
			
			arr[i]=0;
		}
		
		
		for(int i=0;i<s.length();i++){
			
		
				arr[s.charAt(i)]++;  
			
		}
		

		
		char ch = 0;
           for(int i=0;i<NO_OF_CHARS;i++){
			
			if(arr[i]>=0){
				if(arr[i]>index){
				index=arr[i];
				ch=(((char)i));
				System.out.println(i);
				}
			}
		}
		
		return ch;
	}

}
