package take_u_forward_dsa.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,5,3,1,2};
		int nums1[] = {10,22,12,3,0,6};
		Leaders l = new Leaders();
		System.out.println(l.findLeaders(nums1));
		
	}

}

class Leaders{
	public List<Integer> findLeaders(int nums[]){
		
		List<Integer> leaders = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		
		for(int i = nums.length-1; i>=0;  i--) {
			if(leaders.isEmpty()) {
				leaders.add(nums[i]);
				max = nums[i];
			}else if(  nums[i] >  max ) {
				leaders.add(nums[i]);
				max = nums[i];
			}
		}
		Collections.reverse(leaders);
		return leaders;
	}
}
