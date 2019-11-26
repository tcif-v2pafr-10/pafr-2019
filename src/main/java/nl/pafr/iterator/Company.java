package nl.pafr.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
public class Company implements Iterable<Employee> {
	
	private String name;
	List<Department> departments = new ArrayList<Department>();

	public Company() {
		super();
	}

	public Company(String name) {
		super();
		this.name = name;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public void addDepartment(Department department) {
		departments.add(department);

	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", departments=" + departments + "]";
	}

	public Iterator<Employee> iterator() {
		return new EmployeeIterator(this);
	}
}
