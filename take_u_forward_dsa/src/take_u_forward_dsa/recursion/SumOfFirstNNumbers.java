package take_u_forward_dsa.recursion;

import java.util.Arrays;

public class SumOfFirstNNumbers {
	
	public static void main(String[] args) {
//		String[] arr = {"p", "a", "b", "k", "a"};
//		reverseString(arr, 0, arr.length-1);
//		System.out.println(Arrays.toString(arr));
		String str = "abcdeedba";
//		System.out.println(checkPalindrome(str, 0, str.length()-1));
		System.out.println(checkPrime(2, 7));
	}
	
	public static int sumOfFirstN(int n) {
		if(n == 0) return n;
		return n + sumOfFirstN(n-1);
	}
	
	public static int findFactorial(int n) {
		if(n == 0) return 1;
		return n * findFactorial(n-1);
	}
	
	public static int findSumOfArray(int i, int[] nums) {
		if(i> nums.length-1) return 0;
		return nums[i] + findSumOfArray(i+1, nums);
	}
	
	public static void reverseString(String[] arr, int left, int right) {
		if(left>=right) return;
		String leftString = arr[left];
		arr[left] = arr[right];
		arr[right] = leftString;
		reverseString(arr, left+1, right-1);
	}
	
	public static boolean checkPalindrome(String str, int left, int right) {
		if(left>=right) return true;
		if (str.charAt(left)!= str.charAt(right)) return false;
		return checkPalindrome(str, left+1, right-1);
	}
	
	public static boolean checkPrime(int i, int n) {
		if(i>=n) return true;
		if(n % i == 0) return false;
		return checkPrime(i+1, n);
	}

}
