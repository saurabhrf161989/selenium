package miscellaneous;

import java.util.HashMap;

public class arrayEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[]={1,2,3};
		int arr2[]={1,2,4};
		
   System.out.println(equalsCheck(arr1,arr2));
		
	}
	
	
	public static boolean equalsCheck(int arr1[],int arr2[]){
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		int count=0;
		for(int i=0;i<arr1.length;i++){
			
			if(map.get(arr1[i])==null){
				map.put(arr1[i],1);
			}else{
				count= map.get(arr1[i]);
				map.put(arr1[i],count+1);
			}
		}
		
		
		for(int i=0;i<arr2.length;i++){
			System.out.println(map);
			if (!map.containsKey(arr2[i])) 
                return false; 
			
			if(map.get(arr2[i])==0)
				return false;
			
			count=map.get(arr2[i]);
			count--;
			map.put(arr2[i], count);
			
		}
		
		return true;
	}

}
