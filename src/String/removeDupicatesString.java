package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDupicatesString {

	public static void main(String[] args) {
	String s="saurabh";
	
	usingHashSet(s);
	}
	
	public static void usingHashSet(String s){
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		char ch;
		for(int i=0;i<s.length();i++){
			
			ch=s.charAt(i);
			hs.add(ch);
		}
		
		System.out.println(hs);
	}

}
