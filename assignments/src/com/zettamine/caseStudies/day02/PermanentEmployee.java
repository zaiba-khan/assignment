package com.zettamine.caseStudies.day02;

public class PermanentEmployee extends Employee{

	protected double basicPay;	
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	public void calculateSalary() {
		int pfAmount = (int) (basicPay * 0.12);
		salary = basicPay - pfAmount;
		
	}
	
	
}
