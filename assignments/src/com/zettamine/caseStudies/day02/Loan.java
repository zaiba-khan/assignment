package com.zettamine.caseStudies.day02;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loan = 0;
		
		if(employeeObj instanceof TemporaryEmployee) {
			employeeObj.calculateSalary();
			loan =  employeeObj.getSalary()*0.15;
			return loan;
		}
		else{
			employeeObj.calculateSalary();
			loan =  employeeObj.getSalary()*0.15;
			return loan;
		}
	}
}
