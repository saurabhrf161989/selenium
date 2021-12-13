package String;

public class nonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="geekhsforgeeks";
		
		System.out.println(nonFirstRepeatingelement(s));
		
		System.out.println(s.charAt(nonFirstRepeatingelement(s)));
	}
	
	public static int nonFirstRepeatingelement(String s){
		
		int index=Integer.MAX_VALUE;
		
		int NO_OF_CHARS = 256; 
		
		int arr[] = new int[NO_OF_CHARS]; 
		
		for(int i=0;i<NO_OF_CHARS;i++){
			
			arr[i]=-1;
		}
		
		
		for(int i=0;i<s.length();i++){
			
			if(arr[s.charAt(i)]==-1){
				arr[s.charAt(i)] = i; 
			}else{
				arr[s.charAt(i)] = -2; 
			}
		}
		

		
		
           for(int i=0;i<NO_OF_CHARS;i++){
			
			if(arr[i]>=0){
				index=Math.min(index, arr[i]);
				
			}
		}
		
		return index;
	}

}
