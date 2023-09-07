package designpattern.observer;

public class Demo {
	public static void main(String[] args) {
		IphoneObservable iphoneObservable = new IphoneObservable();
		Observer emailObserver = new EmailObserver();
		Observer smsObserver = new SMSObserver();

		iphoneObservable.addObserver(emailObserver);
		iphoneObservable.addObserver(smsObserver);

		System.out.println(iphoneObservable.observers);

		iphoneObservable.setStockCount(1);

		iphoneObservable.removeObserver(smsObserver);

		System.out.println(iphoneObservable.observers);

	}
}
