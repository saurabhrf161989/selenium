package String;

public class kmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="aabaabaaa";
		
		int[] arr = new int[str.length()];
		//arr=pattern(str);
		
		pattern(str,str.length(),arr);
		printArray(arr);
	}
	
	static void KMPSearch(String pat, String txt) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
  
        // create lps[] that will hold the longest 
        // prefix suffix values for pattern 
        int lps[] = new int[M]; 
        int j = 0; // index for pat[] 
  
        // Preprocess the pattern (calculate lps[] 
        // array) 
        pattern(pat, M, lps); 
  
        int i = 0; // index for txt[] 
        while (i < N) { 
            if (pat.charAt(j) == txt.charAt(i)) { 
                j++; 
                i++; 
            } 
            if (j == M) { 
                System.out.println("Found pattern "
                                   + "at index " + (i - j)); 
                j = lps[j - 1]; 
            } 
  
            // mismatch after j matches 
            else if (i < N && pat.charAt(j) != txt.charAt(i)) { 
                // Do not match lps[0..lps[j-1]] characters, 
                // they will match anyway 
                if (j != 0) 
                    j = lps[j - 1]; 
                else
                    i = i + 1; 
            } 
        } 
    } 
	
	public static void pattern(String pat,int M, int lps[]){
		
		 // length of the previous longest prefix suffix 
        int j = 0; 
        int i = 1; 
        lps[0] = 0; // lps[0] is always 0 
  
        // the loop calculates lps[i] for i = 1 to M-1 
        while (i < M) { 
            if (pat.charAt(i) == pat.charAt(j)) { 
                j++; 
                lps[i] = j; 
                i++; 
            } 
            else // (pat[i] != pat[j]) 
            { 
                // This is tricky. Consider the example. 
                // AAACAAAA and i = 7. The idea is similar 
                // to search step. 
                if (j != 0) { 
                    j = lps[j - 1]; 
  
                    // Also, note that we do not increment 
                    // i here 
                } 
                else // if (j == 0) 
                { 
                    lps[i] = j; 
                    i++; 
                } 
            } 
        } 
    } 
	
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]);
		}
	}
}
