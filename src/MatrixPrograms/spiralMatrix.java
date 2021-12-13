package MatrixPrograms;

public class spiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]={
				{ 1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		             };
		int k=0;
		int m=4;
		int l=0;
		int n=4;
		
		while(k<m && l<n){
			
			for(int i=l;i<n;i++){
				System.out.println(mat[k][i]);
			}
			k++;
			
			for(int i=k;i<m;i++){
				
				System.out.println(mat[i][n-1]);	
			}
			n--;
			
			
				
				for(int i=n-1;i>=l;i--){
					System.out.println(mat[m-1][i]);
				}
				m--;
			
			
			
				
				for(int i=m-1;i>=k;i--){
					System.out.println(mat[i][l]);
				}
				l++;
			
		}
           
		}
		
	

}
