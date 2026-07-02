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
//        List<Integer> ans = new ArrayList<>();
//        for(Integer key: map.keySet()){
//            if(map.get(key)> nums.length/3){
//                ans.add(key);
//            }
//        }
        List<Integer> ans2 = map.entrySet()
        									.stream()
        									.filter(e -> e.getValue() > (nums.length/3))
        									.map(e ->e.getKey())
        									.collect(Collectors.toList());
        return ans2;
    }
}
