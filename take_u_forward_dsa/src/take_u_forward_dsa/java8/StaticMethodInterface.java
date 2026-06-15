package take_u_forward_dsa.java8;

@FunctionalInterface
public interface StaticMethodInterface {
	 int calculate();
	public static void main(String[] args) {
		System.out.println("I am from main method interface");
		Check c = new Check();
		System.out.println(c.add.calculate());
	}

}

class Check{
	StaticMethodInterface add = () -> 10;
	
}