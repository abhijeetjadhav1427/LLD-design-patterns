package designpattern.facade;

public class NotificationSystem {
	public void sendEmail(User user, int ticketNumber) {
		System.out.println(
				"send mail to " + user.getName() + " on " + user.getEmail() + " for ticketNo.: " + ticketNumber);
	}

	public void sendSms(User user, int ticketNumber) {
		System.out.println(
				"send mail to " + user.getName() + " on " + user.getPhoneNumber() + " for ticketNo.: " + ticketNumber);
	}
}
