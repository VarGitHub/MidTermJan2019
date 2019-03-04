package design;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;

public class EmployeeInfo implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	private String empId;
	private String lastName;
	private String firstName;
	private char gender;
	private Department department;
	private String title;
	private double baseSalary;
	private String joiningDate;
	private double grossSalary;
	private double bonus;
	private double pension;
	private int performance;
	private static String companyName = "PNT";
	private static int nextId = 1;
	Department d;


	public EmployeeInfo() {}
	public EmployeeInfo(String lastName, String firstName, char gender, double baseSalary, String title, String joiningDate) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.gender = gender;
		this.baseSalary = baseSalary;
		this.title = title;
		this.joiningDate = joiningDate;
		empId = (new CreateId().generateId());
	}
	//Inner class
	private class CreateId {
		public String generateId() {
			String id = "";
			id = companyName + String.format("%03d", nextId);
			nextId++;
			return id;
		}
	}
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */

	@Override
	public double calculateSalary() {
		return calculateEmployeePension(getJoiningDate()) + calculateEmployeeBonus(getPerformance()) + benefitLayout();
	}
	public int getPerformance() {
		return this.performance;
	}
	public void setPerformance(int p) {
		this.performance = p;
	}
	public String getJoiningDate() {
		return this.joiningDate;
	}
	public String getLastName() {
		return lastName;
	}
	public void setGrossSalary() {
		grossSalary = baseSalary + calculateSalary();
	}
	public String getEmpId() {
		return this.empId;
	}

	@Override
	public void assignDepartment(Department dept) {
		this.department = dept;
	}

	@Override
	public double benefitLayout() {
		double benefits = 0.0;
		switch(title) {
			case "Manager":
				benefits = 10000.0;
				break;
			case "Developer":
				benefits = 3000.0;
				break;
			case "Director":
				benefits = 25000.0;
				break;
			case "Secretary":
				benefits = 2500.0;
				break;
		}
		return benefits;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public double calculateEmployeeBonus(int performance){
		double total=0;
		switch(performance) {
			case 1:
				total = baseSalary * 0.05;
				break;
			case 2:
				total = baseSalary * 0.06;
				break;
			case 3:
				total = baseSalary * 0.07;
				break;
			case 4:
				total = baseSalary * 0.08;
				break;
			case 5:
				total = baseSalary * 0.10;
				break;
		}
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public double calculateEmployeePension(String joiningDate) {
		Calendar cal = Calendar.getInstance();
		double total=0.0;
		Date joinDate = new Date();
		/*Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();*/
        //String convertedJoiningDate = "1/"+DateConversion.convertDate(joiningDate);
        //String convertedTodaysDate = "1/"+DateConversion.convertDate(todaysDate);
		try {
			joinDate = new SimpleDateFormat("dd/MM/yyyy").parse(joiningDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long diffMsec = System.currentTimeMillis() - joinDate.getTime();
		long diff = TimeUnit.DAYS.convert(diffMsec, TimeUnit.MILLISECONDS);
		int years = (int) diff/365;
		if (years >=1 && years <=2 )
			total = baseSalary * 0.05;
		if (years >= 2 && years <=5)
			total = baseSalary * 0.10;
		if (years >= 5 && years <= 10)
			total = baseSalary * 0.20;
		if (years > 10)
			total = baseSalary * 0.25;
		//implement numbers of year from above two dates
		//Calculate pension
		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
	public String toString() {
		return firstName+" "+lastName+", "+empId+", "+title+", "+department+" department "+grossSalary;
	}
}
