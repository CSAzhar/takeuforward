package take_u_forward_dsa.adv.sorting;

import java.util.Arrays;

public class QuickSortAlgo {
	public static void main(String[] args) {
		int nums[] = {4,6,2,5,1,8,44,12,66,3};
		quickSort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void quickSort(int nums[], int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pivot = partition(nums, si, ei);
		quickSort(nums, si, pivot-1);
		quickSort(nums, pivot+1, ei);
	}
	
	public static int partition(int nums[], int si, int ei) {
		int pivot = nums[ei];
		int left = si;
		int right = ei;
		int ai = si-1;
		while(left<right) {
			if(nums[left]<= pivot) {
				ai++;
				swap(nums, left, ai);
			}
			left++;
		}
		ai++;
		swap(nums, left, ai);
		return ai;
			
	}
	public static void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
