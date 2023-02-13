package sortingobjects;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {

		int id1 = this.id;
		int id2 = o.id;

		if (id1 < id2) {
			//return 0;
			return -1;
		} else if (id1 > id2) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
