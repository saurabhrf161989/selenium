package String;

public class repeatedCharacterPresentfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="geeksforgeeks";
		char c;
		char d;
		
		outerloop:
			
		for(int i=0;i<a.length()-1;i++){
			
			c=a.charAt(i);
			 
			for(int j=i+1;j<a.length();j++){
				
				d=a.charAt(j);
				
				if(c==d){
					
					System.out.println(c);
					break  outerloop;
				}
			}
		}
	}

}
