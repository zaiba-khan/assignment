package com.zettamine.caseStudies.day02;

import java.util.Scanner;

public class Ticket {

	static Scanner sc = new Scanner(System.in);

	private int ticketid;
	private int price;
	private static int availableTickets;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}

	public int calculateTicketCost(int noOfTickets) {

		if (noOfTickets <= availableTickets) {
			int total = price * noOfTickets;
			availableTickets = availableTickets - noOfTickets;
			return total;
		} else {
			return -1;
		}

	}

}
