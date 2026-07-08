package take_u_forward_dsa.recursion;

import java.util.Arrays;

public class RecursionTwo {
	public static void main(String[] args) {
//		printNumberNToOne(3);
		int arr[] = new int[] {1,2,3,4,5, 4};
//		reverseArray(arr, 0);
//		System.out.println(checkSortedArray(arr, 1));
		System.out.println(sumDigitntilSingleDigit(0));
//		System.out.println(Arrays.toString(arr));
	}
	
	public static void printNumber(int i, int n) {
		if(i > n) return;
		System.out.println(i);
		printNumber(i+1, n);
	}
	
	public static void printNumberOneToN(int n) {
		
		if(n==0) {
			
			return;
		}
		printNumberOneToN(n-1);
		System.out.println(n);
	}
	
	public static void printNumberNToOne(int n) {
		if(n==0) return;
		System.out.println(n);
		printNumberNToOne(n-1);
	}
	
	public static void reverseArray(int arr[], int i) {
		if(i >= arr.length/2) return;
		int n = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = n;
		
		reverseArray(arr, i+1);
	}
	
	public static boolean checkSortedArray(int[] nums, int i) {
		if(nums.length<=1) return true;
		System.out.println("op  -"+i);
		if(i >= nums.length) return true;
		if(nums[i] < nums[i-1]) return false;
		return checkSortedArray(nums, i+1);
		
	}
	
	public static int sumDigitntilSingleDigit(int nums) {
		if(nums <=9) return nums;
		int sum = 0;
		while(nums > 0) {
			sum += nums%10;
			nums/=10;
		}
		return sumDigitntilSingleDigit(sum);
				
	}

}
