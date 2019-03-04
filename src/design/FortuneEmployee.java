package design;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		
		List<EmployeeInfo> empInfo = new ArrayList<>();
		EmployeeInfo emp = new EmployeeInfo();
		String[] parts = null;
		try {
			BufferedReader br = new BufferedReader((new FileReader("/Users/varija/Documents/Selenium/MidtermJanuary2019/src/design/Employee_Data")));

		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			parts = line.split(",");
			empInfo.add(new EmployeeInfo(parts[0], parts[1], parts[2].charAt(0), Double.parseDouble(parts[3]), parts[4], parts[5]));
		}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//empInfo.add(new EmployeeInfo(parts[0], parts[1], parts[2].charAt(0), Double.parseDouble(parts[3]), parts[4], parts[5]));
		empInfo.add(new EmployeeInfo("Allen", "Barry", 'M', 80000.0,  "Developer", "1/3/2000"));

		for (EmployeeInfo e : empInfo) {
			if (e.getLastName().equals("Nadella")) {
				e.assignDepartment(Employee.Department.IT);
				e.setPerformance(5);
				e.setGrossSalary();
			}
		}
		empInfo.get(2).assignDepartment(Employee.Department.Development);
		empInfo.get(2).setPerformance(3);
		empInfo.get(2).setGrossSalary();

		for (EmployeeInfo e : empInfo) {
			System.out.println(e);}
	}

}
