package take_u_forward_dsa.array;

import java.util.Arrays;

public class NextPermutation {
	public static void main(String[] args) {
		int nums[] = {3,2,1};
		Permutation sol = new Permutation();
		sol.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
}

class Permutation{
	public void nextPermutation(int nums[]) {
		int pivot = -1;
		for(int i=nums.length-2; i>=0; i--) {
			if(nums[i]< nums[i+1]) {
				pivot = i;
				System.out.println("Pivot index is = "+pivot);
				break;
			}
		}
		if(pivot == -1) {
			int start = 0, end = nums.length-1;
			while(start<end) {
				swap(nums, start, end);
				start++; end--;
			}
			return;
		}
		int smaller = -1;
		for(int i=nums.length-1; i>pivot; i--) {
			if(nums[i]>nums[pivot]) {
				smaller = i;
				System.out.println("Smaller index is = "+smaller);
				swap(nums, pivot, smaller);
				break;
			}
		}
		int start = pivot+1, end = nums.length-1;
		while(start<end) {
			swap(nums, start, end);
			start++; end--;
		}
		
	}
	
	public void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
