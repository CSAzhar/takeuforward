package take_u_forward_dsa.recursion;

public class RecursionTwo {
	public static void main(String[] args) {
		printNumberNToOne(3);
	}
	
	public static void printNumber(int i, int n) {
		if(i > n) return;
		System.out.println(i);
		printNumber(i+1, n);
	}
	
	public static void printNumberOneToN(int n) {
		
		if(n==0) {
			
			return;
		}
		printNumberOneToN(n-1);
		System.out.println(n);
	}
	
	public static void printNumberNToOne(int n) {
		if(n==0) return;
		System.out.println(n);
		printNumberNToOne(n-1);
	}

}
