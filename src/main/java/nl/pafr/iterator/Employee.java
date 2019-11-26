package nl.pafr.iterator;

public class Employee {
	private String name;
	private int salary;

	public Employee() {
	}

	public Employee(String name, int salary) {
		this.setName(name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
