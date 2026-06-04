package take_u_forward_dsa.adv.arr.fundamentals;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionAndIntersection {
	public static void main(String[] args) {
		int nums1[] = {1,2,3,4,5};
		int nums2[] = {1,2,7};
		System.out.println(Arrays.toString(intersectionOfArrays(nums1, nums2)));
	}
	
	public static int[] intersectionOfArrays(int nums1[], int nums2[]) {
		Set<Integer> set = new TreeSet<>();
		for(int num : nums1) {
			set.add(num);
		}
		for(int n: nums2) {
			set.add(n);
		}
		int intersection[] = new int[set.size()];
		int i=0;
		for(int n: set) {
			intersection[i++] = n;
		}
		return intersection;
	}

}
