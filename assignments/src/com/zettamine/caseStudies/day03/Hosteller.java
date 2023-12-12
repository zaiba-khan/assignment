package com.zettamine.caseStudies.day03;

public class Hosteller {	
	
	public Hosteller(String hostelName, int roomNumber) {
		super();
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	private String hostelName;
	private int roomNumber;
	
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	@Override
	public String toString() {
		return "\n Hostel Name : " + hostelName + "\n Room number : " + roomNumber;
	}

	
	
}
