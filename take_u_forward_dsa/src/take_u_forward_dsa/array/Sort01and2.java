package take_u_forward_dsa.array;
import java.util.Arrays;

public class Sort01and2 {
	public static void main(String[] args) {
		int nums[] = {2,0,2,1,1,0};
		sortColor(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	public static void sortColor(int nums[]) {
		int pointer=0, zero=0, second=nums.length-1;
		while(pointer<second) {
			if(nums[pointer] == 0) {
				int temp = nums[pointer];
				nums[pointer] = nums[zero];
				nums[zero] = temp;
				
				pointer++; zero++;
			} else if( nums[pointer] == 1) {
				pointer++;
			}else {
				int temp = nums[pointer];
				nums[pointer] = nums[second];
				nums[second] = temp;
				second--;
			}
		}
	}

}
