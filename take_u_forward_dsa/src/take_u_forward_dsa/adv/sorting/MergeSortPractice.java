package take_u_forward_dsa.adv.sorting;

import java.util.Arrays;

public class MergeSortPractice {
	public static void mergeSort(int nums[], int si, int ei) {
		if(si>=ei) return;
		int mi = si + (ei-si)/2;
		mergeSort(nums, si, mi);
		mergeSort(nums, mi+1, ei);
		merge(nums, si, mi, ei);
	}
	public static void merge(int nums[], int si, int mi, int ei) {
		int temp[] = new int[ei-si+1];
		int left = si, right =mi+1, ai = 0;
		
		while(left<=mi && right<= ei) {
			if(nums[left] <= nums[right]) {
				temp[ai++] = nums[left++];
			}else {
				temp[ai++] = nums[right++];
			}
		}
		while(left<=mi) {
			temp[ai++] = nums[left++];
		}
		while(right<=ei) {
			temp[ai++] = nums[right++];
		}
		for(int i=0; i<temp.length; i++) {
			nums[si+i] = temp[i];
		}
	}
	public static void main(String[] args) {
		int nums[] = {5,7,88,12,898,4,33,6,1,0,445};
		mergeSort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}

}
