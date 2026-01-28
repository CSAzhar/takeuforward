package take_u_forward_dsa.basic.timecomplexity;

import java.util.HashMap;

public class TotalNumberOfDigits {
	
	public int findTotalNumberOfDigits(int number) {
		String nums = Integer.toString(10);
		
		System.out.println(""+20+10);
		int digits = 0;
		if(number == 0) return 1;
		HashMap<Integer, Integer> map = new HashMap<>();
		number = number < 0 ? number * -1 : number * 1;
		while(number >0) {
			number/=10;
//			map.put(number, map.getOrDefault(map, map.get(number)))
			digits++;
		}
		return digits;
		
	}
	
	public static void main(String[] args) {
		TotalNumberOfDigits ofDigits = new TotalNumberOfDigits();
		System.out.println(ofDigits.findTotalNumberOfDigits(11000));
	
	}

}
