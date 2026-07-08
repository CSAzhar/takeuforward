package take_u_forward_dsa.array;

public class MatrixProblem {
	
	public static void main(String[] args) {
		int[][] matrix = {
			    {1,  2,  3,  4,  5},
			    {6,  7,  8,  9,  10},
			    {11, 12, 13, 14, 15},
			    {16, 17, 18, 19, 20},
			    {21, 22, 23, 24, 25}
			};
		
		Matrix sol = new Matrix();
		printMatrix(matrix);
		System.out.println();
		sol.rotatematrixBy90(matrix);
		printMatrix(matrix);
		
		
	}
	
	
	public static void printMatrix(int[][] matrix) {
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	            System.out.printf("%4d", matrix[i][j]);
	        }
	        System.out.println();
	    }
	}

}

class Matrix {
	public void rotatematrixBy90(int matrix[][]) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length/2; j++) {
				int lastIdx = matrix[j].length-j-1;
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][lastIdx];
				matrix[i][lastIdx] = temp;
			}
		}
	}
}
