package take_u_forward_dsa.array;

import java.util.Arrays;

public class PascalTriangleOne {
	public static void main(String[] args) {
		int r = 5, c=3;
//		System.out.println(findNthandRthInPascals(r-1, c-1));
		
//		System.out.println(Arrays.toString(getELementsInRow(5)));
		System.out.println(Arrays.toString(pascalsOptimizedGetRowElements(2)));
	}
	
	
	//pascals triangle optimized
	public static int[] pascalsOptimizedGetRowElements(int row) {
		int sol[];
		if(row<=2) {
			sol = new int[row];
			Arrays.fill(sol, 1);
			return sol;
		}
		 sol = new int[row];
		 int ans = 1;
		 for(int i=0; i<row; i++) {
			 if( i == 0 || i == row-1) {
				 sol[i] = 1;
			 }else {
				 ans = (ans * (row - i ))/i;
				 sol[i] = ans;
			 }
		 }
		return sol;
	}
	//pascals 2
		public static int[] getELementsInRow(int row) {
			int ans[] = new int[row+1];
			for(int i=0; i<row+1; i++) {
				ans[i] = findNthandRthInPascals(row, i);
			}
			return ans;
		}
		
		//pascals 1
	
	public static int findNthandRthInPascals(int n, int r) {
		int ans = 1;
		for(int i=0; i<r; i++) {
			ans = ans * (n-i);
			ans = ans / (i+1);
		}
		return ans;
	}

}
