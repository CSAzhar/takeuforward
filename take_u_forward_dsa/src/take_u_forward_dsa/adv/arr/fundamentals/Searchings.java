package take_u_forward_dsa.adv.arr.fundamentals;

public class Searchings {
	public static void main(String[] args) {
		int nums[] = new int[] {3,66,2,55,12,88,54};
		System.out.println(findLargestElement(nums));
		System.out.println(secondLargestElement(nums));
	}
	public static int findLargestElement(int nums[]) {
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			ans = Math.max(ans, nums[i]);
		}
		return ans;
	}
	
	public static int secondLargestElement(int nums[]) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>largest && nums[i]>secondLargest) {
				secondLargest = largest;
				largest = nums[i];
			}else if( nums[i] < largest && nums[i] > secondLargest) {
				secondLargest = nums[i];
			}
		}
		return secondLargest;
	}
	
	public int maxConOnes(int nums[]) {
		int count=0;
		int ans=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 1) {
				count++;
				ans = Math.max(ans, count);
			}else {
				count = 0;
			}
		}
		return ans;
	}
	

}
