package com.zettamin.caseStudies.day02;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket ticket = new Ticket();

		System.out.print("Enter number of bookings : ");
		int noOfBookings = sc.nextInt();

		System.out.printf("Enter the available tickets : ");
		int avail = sc.nextInt();
		if (avail > 0) {
			Ticket.setAvailableTickets(avail);
		} else {
			System.err.println("Available tickets cannot be negative");
			return;
		}

		for (int i = 0; i < noOfBookings; i++) {

			System.out.printf("Enter the ticket id : ");
			int ticketId = sc.nextInt();
			ticket.setTicketid(ticketId);

			System.out.printf("Enter the price : ");
			int price = sc.nextInt();
			ticket.setPrice(price);

			System.out.printf("Enter the number of tickets : ");
			int reqTickets = sc.nextInt();

			System.out.println("=".repeat(20) + "TICKET DETAILS" + "=".repeat(20));
			System.out.println("Available Tickets : " + Ticket.getAvailableTickets());
			int total = ticket.calculateTicketCost(reqTickets);
			System.out.println("Total Amount : " + total);
			System.out.println("Available Tickets after Booking : " + Ticket.getAvailableTickets());
			System.out.println("=".repeat(20) + "TICKET DETAILS END FOR BOOKING " + (i + 1) + "=".repeat(20));
		}

		sc.close();

	}

}
