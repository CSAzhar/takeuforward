package take_u_forward_dsa.array;

public class SubArray {
	
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5, 6};
		SubArrayTest test = new SubArrayTest();
		test.printSubArray(nums);
	}

}

class SubArrayTest{
	public void printSubArray(int nums[]) {
		int max = Integer.MIN_VALUE;
		for(int start = 0; start<nums.length; start++) {
			for(int end = start; end<nums.length; end++) {
				int tempSum = 0;
				for(int i=start; i<=end; i++) {
					System.out.print(nums[i]+" ");
					tempSum+=nums[i];
				}
				System.out.println("tem is ="+tempSum);
				max = Math.max(max, tempSum);
			}
		}
		System.out.println("Max sum is = "+max);
	}
}
