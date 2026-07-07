package take_u_forward_dsa.array;

import java.util.ArrayList;
import java.util.List;

public class MissingAndRepeatingNumber {
	public static void main(String[] args) {
		int nums[] = {4,3,6,2,1,1};
		SolutionMandD sol = new SolutionMandD();
		System.out.println(sol.missingAndRepeatingNumber(nums));
	}

}
class SolutionMandD{
	
	public List<Integer> missingAndRepeatingNumber(int nums[]){
		List<Integer> ans = new ArrayList<>();
		int n = nums.length;
		int sumOfN = (n * (n+1))/2;
		int sumOfN2 = (n * (n+1) * (2*n+1))/6;
		int sum1 = 0, sum2 = 0;
		for(int i=0; i<=n-1; i++) {
			sum1 += nums[i]; sum2 += nums[i] * nums[i];
		}
		int xMy = sum1 - sumOfN;
		int xPy = (sum2 - sumOfN2)/xMy;
		int x = (xMy + xPy)/2;
		int y = xPy-x;
		ans.add(x);
		ans.add(y);
		return ans;
	}
}
