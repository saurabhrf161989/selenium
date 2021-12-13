package String;

public class charcterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int NO_OF_CHARS = 256; 

String s1="Aababcde";
		
		int arr[] = new int[NO_OF_CHARS]; 
		
		for(int i=0;i<NO_OF_CHARS;i++){
			
			arr[i]=0;
		}
		
			for(int i=0;i<s1.length();i++){
				
				
				char b=s1.charAt(i);
				
				System.out.print("char is = "+b);
				
                 int ascii_value=s1.charAt(i);
				
				System.out.println(" and ascii value is = "+ascii_value);
				arr[s1.charAt(i)]=arr[s1.charAt(i)]+1;
				
				
			//  arr[s2.charAt(i)]--;
			}
			
			for(int i=0;i<NO_OF_CHARS;i++){
				
				System.out.print("i is "+i);
				System.out.println(" "+arr[i]);
			}
			

	}

}
