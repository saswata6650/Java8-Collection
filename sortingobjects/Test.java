package sortingobjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
//		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(900, "Obama"));
		set.add(new Employee(400, "Tom"));
		set.add(new Employee(800, "Bharath"));
		set.add(new Employee(300, "Rambo"));

		for (Employee employee : set) {
			System.out.println(employee);
		}

	}

}
