package take_u_forward_dsa.adv.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
		
	}
	public static int partition(int arr[], int low, int high) {
		int i = low-1;
		int pivot = arr[high];
		for(int j = low; j<high; j++) {
			if(arr[j]<= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}
	public static void main(String[] args) {
		int arr[] = {6,3,9,5,2,8};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
