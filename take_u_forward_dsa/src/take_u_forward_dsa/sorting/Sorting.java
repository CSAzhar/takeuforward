package take_u_forward_dsa.sorting;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int nums[] = new int[] {5,4, 1, 0, 7, 6};
//		selectionSort(nums);
//		bubbleSort(nums);
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void insertionSort(int nums[]) {
		for(int i=1; i<nums.length; i++) {
			int j=i;
			while(j >0 && nums[j] < nums[j-1]) {
				int t = nums[j];
				nums[j] = nums[j-1];
				nums[j-1] = t;
				j--;
			}
		}
	}
	
	public static void bubbleSort(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			for(int j=1; j<nums.length-i; j++) {
				if(nums[j-1]> nums[j]) {
					int t = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = t;
				}
			}
		}
	}
	
	public static void selectionSort(int nums[]) {
		for(int i = 0; i< nums.length; i++) {
			int minInd = i;
			for(int j= i; j<nums.length; j++) {
				if(nums[j]< nums[minInd]) minInd = j;
			}
			
			int temp = nums[minInd];
			nums[minInd] = nums[i];
			nums[i] = temp;
		}
	}
	
	public void mergeSort(int arr[], int low, int high) {
		if(low == high) return;
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	public void merge(int arr[], int low, int mid, int high) {
		int temp[] = new int[high-low+1];
		int left = low;
		int right = high;
		while(left<=mid && right<=high) {
			
		}
		
	}

}
