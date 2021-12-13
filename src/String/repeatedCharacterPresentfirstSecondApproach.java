package String;

public class repeatedCharacterPresentfirstSecondApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="gsforkga";
		char c;
		char d;
		
	int NO_OF_CHARS = 256; 
	
	int result=200;
		
		int arr[] = new int[NO_OF_CHARS]; 
		
		for(int i=0;i<NO_OF_CHARS;i++){
			
			arr[i]=-1;
		}
		

		for(int i=0;i<s.length();i++){
			
			int a=s.charAt(i);
			System.out.print("at i = " +i);
			System.out.println(" ascii value is = "+a);
			if(arr[s.charAt(i)]==-1){
				arr[s.charAt(i)] = i;
			}else{
			
				result = arr[s.charAt(i)];
		
		}
		
		}
		 
        
          if(result!=200){
          System.out.println(s.charAt(result));
          }
          else
        	  System.out.println(" no chacracter");
	}

}
