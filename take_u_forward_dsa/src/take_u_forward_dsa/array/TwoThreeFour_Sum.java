package take_u_forward_dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoThreeFour_Sum {

	public static void main(String[] args) {
		int nums[] = { 1, 6, 2, 10, 3 };
		int target = 7;
		Sums sol = new Sums();
		System.out.println(Arrays.toString(sol.twoSum(nums, target)));
		System.out.println(Arrays.toString(sol.twoSumUsingPointer(nums, target)));
		@SuppressWarnings("unused")
		String word = "abc";

	}

}

class Sums {
	public int[] twoSum(int nums[], int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				int ans[] = { i, map.get(i) };
				return ans;
			} else {
				map.put(nums[i], i);
			}
		}
		return null;
	}

	public int[] twoSumUsingPointer(int nums[], int target) {
		int ans[] = new int[2];
		Arrays.sort(nums);
		int left = 0, right = nums.length - 1;
		while (left < right) {
			if (left + right == target) {
				ans[0] = left;
				ans[1] = right;
				return ans;
			} else if (left + right > target) {
				right--;
			} else {
				left++;
			}
		}
		return ans;
	}

	public List<List<Integer>> findThreeSum(int nums[]) {
		Set<List<Integer>> ans = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			Map<Integer, Integer> map = new HashMap<>();
			for (int j = i + 1; j < nums.length; j++) {

				Integer third = -(nums[i] + nums[j]);
				if (map.containsKey(third)) {
					List<Integer> temp = new ArrayList<>(Arrays.asList(third, nums[i], nums[j]));
					Collections.sort(temp);
					ans.add(temp);
				} else {
					map.put(nums[j], 0);
				}
			}
		}
		List<List<Integer>> fans = new ArrayList<>(ans);
		return fans;
	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>(); 
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2; i++) {
			if(i!=0 && nums[i] == nums[i-1]) continue;
			for(int j=i+1; j<nums.length-1; j++) {
				if(j!=0 && nums[j] == nums[j-1]) continue;
				int first = nums[i], second = nums[j];
				int k = j+1, l = nums.length-1;
				while(k<l) {
                    int third = nums[k], fourth = nums[l];
				    long sum = (long)first+second+third+fourth;
					if(sum == target) {
						List<Integer> temp = new ArrayList<>(Arrays.asList(first, second, third, fourth));
						ans.add(temp);
						while (k < l && nums[k] == nums[k - 1]) k++;
		                while (k < l && nums[l] == nums[l + 1]) l--;
					}else if(sum>target) {
						l--;
					}else {
						k++;
					}
				}
			}
		}
		return ans;
    }
}
