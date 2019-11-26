package nl.pafr.iterator;
import java.util.Iterator;

public class EmployeeIterator implements Iterator<Employee> {
		private Company company;
		
		public EmployeeIterator(Company company) {
			super();
			this.company = company;
		}

		private int departmentIndex = 0;
		private int employeeIndex = -1;

		public boolean hasNext() {
			int localDepartmentIndex = departmentIndex;
			int localEmployeeIndex = employeeIndex+1;
			while (true) {
				if (localDepartmentIndex < company.departments.size()) {
					while (true) {
						int numEmployees = company.departments.get(localDepartmentIndex).getEmployees().size();
						if (localEmployeeIndex < numEmployees) {
							return true;
						} else {
							localEmployeeIndex = 0;
							localDepartmentIndex++;
							break;
						}
					}
				} else {
					return false;
				}
			}
		}

		public Employee next() {
			int localDepartmentIndex = departmentIndex;
			int localEmployeeIndex = employeeIndex+1;
			while (true) {
				if (localDepartmentIndex < company.departments.size()) {
					while (true) {
						int numEmployees = company.departments.get(localDepartmentIndex).getEmployees().size();
						if (localEmployeeIndex < numEmployees) {
							departmentIndex = localDepartmentIndex;
							employeeIndex = localEmployeeIndex;
							return company.departments.get(localDepartmentIndex).getEmployees().get(localEmployeeIndex);
						} else {
							localEmployeeIndex = 0;
							localDepartmentIndex++;
							break;
						}
					}
				} else {
					return null;
				}
			}
		}
	}
