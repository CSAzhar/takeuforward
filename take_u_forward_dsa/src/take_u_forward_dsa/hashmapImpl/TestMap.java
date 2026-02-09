package take_u_forward_dsa.hashmapImpl;

public class TestMap {
	
	public static void main(String[] args) {
		JodaMap<String, Integer> map = new JodaMap<>();
		System.out.println(map.size());
		System.out.println(map.put("a", 101));
		System.out.println(map.put("b", 102));
		System.out.println(map.put("c", 103));
		System.out.println(map.put("d", 104));
		System.out.println(map.put("e", 104));
		System.out.println(map.put("f", 104));
		System.out.println(map.put("b", 104));
		System.out.println(map.size());
		map.remove("c");
		System.out.println(map.size());
		System.out.println(map.put("a", 1011));
	}

}
