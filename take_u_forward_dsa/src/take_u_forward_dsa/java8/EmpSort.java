package take_u_forward_dsa.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpSort {
	public static void main(String[] args) {

		Employee e4 = new Employee(22, "Aahar");
		Employee e2 = new Employee(9, "Vivek");
		Employee e3 = new Employee(13, "Kumar");
		Employee e1 = new Employee(1, "Azhar");
		
		List<Employee> li = new ArrayList<>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		
//		Collections.sort(li, new ExmSort());
		Collections.sort(li, (a, b) -> b.name.hashCode() - a.name.hashCode());
		System.out.println(li);
	}

}
