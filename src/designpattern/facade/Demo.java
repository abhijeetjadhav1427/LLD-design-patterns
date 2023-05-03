package designpattern.facade;

public class Demo {
	public static void main(String[] args) {
		User user = new User("username", "username@gmail.com", 1234567890);
		
		BookingFacade bookingFacade = new BookingFacade();
		bookingFacade.createBooking(user);
	}
}
