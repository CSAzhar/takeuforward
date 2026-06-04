package take_u_forward_dsa.adv.arr.fundamentals;

import java.util.Arrays;

public class RemoveDuplicateFromSortedarray {
	public static void main(String[] args) {
		int nums[] = new int[] {0, 0, 3, 3,5,6};
		System.out.println(removeDuplicateFromSortedArray(nums));
		System.out.println(Arrays.toString(nums));
	}
	
	public static int removeDuplicateFromSortedArray(int nums[]) {
		int ai = 0;
		int count = 1;
		for(int i=1; i<nums.length; i++) {
			if(nums[i] != nums[ai]) {
				count++;
				ai++;
				nums[ai] = nums[i];
			}
		}
		for(int i = ai+1; i< nums.length; i++) {
			nums[i] = 0;
		}
		return count;
	}

}
