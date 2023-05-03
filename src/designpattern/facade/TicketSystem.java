package designpattern.facade;

public class TicketSystem {
	private int ticketNo;

	public boolean validateAvailability(String movie) {
		return true;
	}

	public void createBooking(int ticketNo, User user, String movie) {
		this.ticketNo = ticketNo;
		System.out.println("Ticket created for user");
	}

	public int getTicketNo() {
		return ticketNo;
	}

}
