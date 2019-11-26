package nl.pafr.iterator;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

@SuppressWarnings("restriction")
public class Main {

	public static void main(String[] args) {
		Company company = new Company("Pafr");
		Department department1 = new Department("I-ICT");
		department1.addEmployee(new Employee("Berend", 6000));
		department1.addEmployee(new Employee("Alex", 3500));
		company.addDepartment(department1);
		Department department2 = new Department("TICT-V2D");
		department2.addEmployee(new Employee("Zyad", 2500));
		department2.addEmployee(new Employee("Tunahan", 1500));
		company.addDepartment(department2);
		Department department3 = new Department("Department 3");
		company.addDepartment(department3);
		Department department4 = new Department("Tesla");
		department4.addEmployee(new Employee("Siebe", 40000));
		company.addDepartment(department4);
		Department department5 = new Department("Department 5");
		company.addDepartment(department5);
		

		/*
		 * Maak gebruik van de java Iterator 
		 * dan is de volgende constructie ook mogelijk.
		 * 
		 * Ik wil nu het totaal van alle salarissen berekenen.
		 */
		int totSalary = 0;
		for (Employee employee : company) {
			totSalary += employee.getSalary();
			System.out.println("employee: "+ employee.getName());
		}
		
		System.out.println("Total salary: " + totSalary);
		/*
		 * De data structuur wil ik simpel opslaan in een XML bestand. Omdat er
		 * in eerste instantie weinig data in de stuctuur zit volstaat een 
		 * XML-bestand
		 */
		
		jaxbObjectToXML(company, "company.xml");
		company = xmlToJaxbObject("company.xml");

	}

	private static Company xmlToJaxbObject(String filename) {
		Company company = null;
		try {
			File file = new File(filename);
			JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			company = (Company) jaxbUnmarshaller.unmarshal(file);
			System.out.println(company);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return company;
	}

	/**
	 * Serializeert de totale company structuur naar een XML-bestand
	 * @param company
	 * @param filename
	 */
	private static void jaxbObjectToXML(Company company, String filename) {
		try {

			File file = new File(filename);
			JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
		       // Set the Marshaller media type to JSON or XML

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(company, file);
			jaxbMarshaller.marshal(company, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
