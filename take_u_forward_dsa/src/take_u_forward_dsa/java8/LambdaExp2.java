package take_u_forward_dsa.java8;

public class LambdaExp2 {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		Thread th1 = new Thread(c1);
		th1.start();
		
		for(int i=0; i<=100; i++) {
			System.out.println("Bye = "+ i );
		}
	}

}
