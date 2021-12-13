package String;

import java.util.HashMap;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="abacdf";
		String s2="edcbaa";
		
		
		
		System.out.println(anagramCheck(s1,s2));
		
		
	}
	
	
	public static boolean anagramCheckUsingHashMap(String s1,String s2){
		
HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		

          int length1=s1.length();
          int length2=s2.length();
          
          if(length1!=length2)
        	  return false;
          
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(map.get(c)==null){
				
				map.put(c, 1);
			}else{
				int count=map.get(c);
				map.put(c, count+1);
			}
		}
		
		for(int i=0;i<s2.length();i++){
			
			System.out.println(map);
			char c=s2.charAt(i);
			
			
			
			if(!map.containsKey(c))
				return false;
			if(map.get(c)==0)
				return false;
			
			int count=map.get(c);
			count--;
			map.put(c, count);
		}
		return true;
	}
	
	public static boolean anagramCheck(String s1,String s2){
		

        int length1=s1.length();
        int length2=s2.length();
        
        if(length1!=length2)
      	  return false;
        
        
		
		int NO_OF_CHARS = 256; 
		
		int arr[] = new int[NO_OF_CHARS]; 
		
		for(int i=0;i<NO_OF_CHARS;i++){
			
			arr[i]=0;
		}
		
			for(int i=0;i<s1.length();i++){
				
				
				
				arr[s1.charAt(i)]++;
				
				
			  arr[s2.charAt(i)]--;
			}

			
		
			for (int i = 0; i < NO_OF_CHARS; i++) 
		        if (arr[i]!=0) {
		        	System.out.println(arr[i]);
		        	System.out.println(i);
		            return false; 
		        }
		    return true; 
			}

}
