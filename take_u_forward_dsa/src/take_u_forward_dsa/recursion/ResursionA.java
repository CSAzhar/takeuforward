package take_u_forward_dsa.recursion;

public class ResursionA {
	public static void main(String[] args) {
//		printName();
		printNameTimes();
	}
	
	static int i =0;
	public static int printName() {
		if( i == 20) return 10;
		i++;
		System.out.println("Azhar printed");
		 return printName();
	}
	public static int printNameTimes() {
		if(i == 4) return 0;
		i++;
		System.out.println("Azhar printed "+i);
		return printNameTimes();
	}

}
