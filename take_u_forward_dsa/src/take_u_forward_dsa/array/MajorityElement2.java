package take_u_forward_dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement2 {

}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> ans2 = map.entrySet()
        									.stream()
        									.filter(e -> e.getValue() > (nums.length/3))
        									.map(e ->e.getKey())
        									.collect(Collectors.toList());
        return ans2;
    }
    
    public List<Integer> maorityOptimized(int[] nums){
    	int count1=0, ans1=0, count2=0, ans2=0;
    	for(int i=0; i<nums.length; i++) {
    		if(count1 == 0) {
    			ans1 = nums[i]; count1++;
    		}else if(count2 == 0) {
    			ans2 = nums[i]; count2++;
    		}else if(nums[i] == ans1 && nums[i] != ans2) {
    			count1++;
    		}
    		else if(nums[i] == ans2 && nums[i] != ans1) {
    			count2++;
    		}else {
    			count1--; count2--;
    		}
    	}
    	List<Integer> ans = new ArrayList<>();
    	ans.add(ans1, ans2);
    	return ans;
    }
}
