package MatrixPrograms;

public class transposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int mat[][]={
				{ 1,2,3,},
				{4,5,6},
				{7,8,9}
		             };
		
		for(int i=0;i<mat.length;i++){
			
			for(int j=0;j<mat[i].length;j++){
				System.out.println(mat[i][j]);
			}
		}
	}

}
