package take_u_forward_dsa.array;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCodeArray {
	public static void main(String[] args) {
		
	}

}

class Solutions {
    public int maxValidPairSum(int[] nums, int k) {
        if(nums.length<=2) return nums[0]+nums[1];
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        int j=nums.length-1, i=nums.length-2, last = nums[nums.length-1];
        while(i>=0){
            if( (map.get(nums[i]) < map.get(nums[j])) && (map.get(last) - map.get(nums[i]) >= k) ){
                ans = Math.max(ans, last+nums[i]);
            }
            i--;
        }
        
        return ans;
    }
}
