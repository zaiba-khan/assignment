package com.zettamine.caseStudies.day02;

public class EmployeeLoanMain {

	public static void main(String[] args) {
		Employee e1 = new TemporaryEmployee(101, "Arpita", 45, 1000);
		Employee e2 = new PermanentEmployee(102, "Zaiba", 25000);
		
		Loan loan = new Loan();
		double tempLoan = loan.calculateLoanAmount(e1);
		double permLoan = loan.calculateLoanAmount(e2);
		
		System.out.println("loan calculated for temporary employee is : " + tempLoan);
		System.out.println("loan calculated for temporary employee is : " + permLoan);
	}

}
