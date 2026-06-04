package take_u_forward_dsa.adv.arr.fundamentals;

import java.util.Arrays;

public class MoveZeroToEnd {
	public static void main(String[] args) {
		int nums[] = new int[] {0,1,4,0,5,2};
		moveZeroToEnd(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void moveZeroToEnd(int nums[]) {
		int ai = -1;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				ai++;
				nums[ai] = nums[i];
			}
		}
		for(int i = ai+1; i<nums.length; i++) {
			nums[i] = 0;
		}
	}

}
