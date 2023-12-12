package com.zettamine.caseStudies.day03;

public class Student {
	protected int studentId;
	protected String name;
	protected int departmentId;
	protected String gender;
	protected long phone;
	protected Hosteller hosteller;
	
	public Student(int studentId, String name, int departmentId, String gender, long phone, Hosteller hosteller) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.departmentId = departmentId;
		this.gender = gender;
		this.phone = phone;
		this.hosteller = hosteller;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Hosteller getHosteller() {
		return hosteller;
	}
	public void setHosteller(Hosteller hosteller) {
		this.hosteller = hosteller;
	}

	@Override
	public String toString() {
		return " StudentId : " + studentId + "\n Student name : " + name + "\n Department ID : " + departmentId + "\n Gender : "
				+ gender + "\n Phone : " + phone + hosteller;
	}
	
	
	
}
