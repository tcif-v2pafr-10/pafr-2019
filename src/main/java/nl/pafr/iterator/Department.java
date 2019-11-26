package nl.pafr.iterator;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("restriction")
public class Department {
	String name;
	List<Employee> employees = new ArrayList<Employee>();

	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	@XmlElement(name = "employee")
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);

	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", employees=" + employees + "]";
	}

	public String getName() {
		return name;
	}

	@XmlElement(name = "name")
	public void setName(String name) {
		this.name = name;
	}

}
