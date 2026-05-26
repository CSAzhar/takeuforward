package take_u_forward_dsa.adv.sorting;

import java.util.Arrays;

public class MergeSortAC {
	
	public static void divide(int nums[], int si, int ei) {
		if(si>= ei) return;
		int mi = si + (ei-si)/2;
		divide(nums, si, mi);
		divide(nums, mi+1, ei);
		merge(nums, si, mi, ei);
		
	}
	 public static void merge(int nums[], int si, int mi, int ei) {
		 int left = si;
		 int right = mi+1;
		 int ai = 0;
		 int temp[] = new int[ei-si+1];
		 while(left<=mi && right<=ei) {
			 if(nums[left]<=nums[right]) {
				 temp[ai++] = nums[left++];
			 }else {
				 temp[ai++] = nums[right++];
			 }
		 }
		 while(left<= mi) {
			 temp[ai++] = nums[left++];
		 }
		 while(right <= ei) {
			 temp[ai++] = nums[right++];
		 }
		 for(int i=0, j = si; i<temp.length; i++, j++) {
			 nums[j] = temp[i];
		 }
		 
	 }
	
	public static void main(String[] args) {
		int nums[] = {5, 3, 7, 0, 1, 3};
		divide(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}

}
