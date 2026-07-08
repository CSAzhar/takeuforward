package take_u_forward_dsa.java8;

import java.util.Comparator;

public class ExmSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.hashCode() - o2.name.hashCode();
	}

}
