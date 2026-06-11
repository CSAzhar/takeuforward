package take_u_forward_dsa.java8;

@FunctionalInterface
interface Math {
	int calculate(int... nums);
//	void print(String s);
}

public class LambdaExp {
	public static void main(String[] args) {
		Math add = (int... nums) -> {
			int ans = 0;
			for (int a : nums) {
				ans += a;
			}
			return ans;
		};
		System.out.println(add.calculate(1, 44, 33, 55, 434, 2, 66));
//		Math myPrint = s -> System.out.println("Hi - "+s);
//		myPrint.print( "azhar uddin");
	}
}
