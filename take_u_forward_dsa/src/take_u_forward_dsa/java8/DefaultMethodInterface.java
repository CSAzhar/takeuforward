package take_u_forward_dsa.java8;


public interface DefaultMethodInterface {
	
	void printSomething();
//	int add();
	default int math() {
		return 10;
	}

}
class A implements DefaultMethodInterface{

	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		
	}
	
}
