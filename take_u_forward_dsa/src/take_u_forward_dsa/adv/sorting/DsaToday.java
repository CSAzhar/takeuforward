package take_u_forward_dsa.adv.sorting;

import java.util.HashMap;

public class DsaToday {
	public static void main(String[] args) {
		String word = "aaAbcBC";
		System.out.println(numberOfSpecialChars(word));
	}
	
	public static int numberOfSpecialChars(String word) {
        
		HashMap<Character, Integer> map = new HashMap<>();
		int ans = 0;
		for(int i=0; i<word.length(); i++) {
			Character curr = word.charAt(i);
			if(Character.isUpperCase(curr)) {
				map.put(curr, 1);
			}
		}
		for(int i=0; i<word.length(); i++) {
			Character curr = word.charAt(i);
			if(Character.isLowerCase(curr)) {
				Character c = curr.toUpperCase(curr);
				if(map.containsKey(c)) {
					ans++;
					map.remove(c);
				}
			}
		}
		return ans;
    }

}
