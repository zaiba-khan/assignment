package com.zettamin.caseStudies.day02;

public class StudentDetails {

	private int studentId;
	private String studentName, studentAddress, collegeName;
	
	public StudentDetails(int studentId, String studentName, String studentAddress, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return " StudentId : " + studentId + "\n Student name : " + studentName + "\n Address : " + studentAddress +
				"\n College Name : " + collegeName;
	}
	
}
