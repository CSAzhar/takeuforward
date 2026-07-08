package take_u_forward_dsa.adv.arr.fundamentals;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5, 6, 7, 8, 9};
//		leftRotateArrayByOne(nums);
		rotateArrayByKTimes(nums, 4);
		System.out.println(Arrays.toString(nums));
		
	}
	public static void leftRotateArrayByOne(int nums[]) {
		int left = nums[0];
		for(int i=1; i< nums.length-2; i++) {
			nums[i-1] = nums[i];
		}
		nums[nums.length-1] = left;
	}
	
	public static void rotateArrayByKTimes(int nums[], int k) {
		int n = k % nums.length;
		int si = 0;
		int ei = nums.length-1;
		reverseArray(nums, si, n-1);
		reverseArray(nums, n, ei);
		reverseArray(nums, si, ei);
		
	}
	public static void reverseArray(int nums[], int si, int ei) {
		while(si < ei) {
			int temp = nums[si];
			nums[si] = nums[ei];
			nums[ei] = temp;
			si++;
			ei--;
		}
		System.out.println(Arrays.toString(nums));
	}

}
