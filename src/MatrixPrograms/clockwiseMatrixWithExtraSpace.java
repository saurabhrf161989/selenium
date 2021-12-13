package MatrixPrograms;

public class clockwiseMatrixWithExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int mat[][]={
				{ 1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		             };
	
	
	
	
	 int mat2[][]=new int[4][4];
	 
	 int n=4;
	 
	 for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				mat2[i][j]=mat[n-j-1][i];
				System.out.println(mat2[i][j]);
			}
		}

}
}
