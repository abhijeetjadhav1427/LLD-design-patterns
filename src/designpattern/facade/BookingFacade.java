package designpattern.facade;

public class BookingFacade {
	public void createBooking(User user) {
		TicketSystem ts = new TicketSystem();
		PaymentSystem ps = new PaymentSystem();
		NotificationSystem ns = new NotificationSystem();
		
		boolean isBookingPossible = ts.validateAvailability("movie");
		if(isBookingPossible) {
			ts.createBooking(100, user, "movie");
			
			ps.chargeCard();
			ns.sendEmail(user, ts.getTicketNo());
			ns.sendSms(user, ts.getTicketNo());
		}
	}
}
