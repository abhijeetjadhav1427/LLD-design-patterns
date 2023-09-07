package designpattern.observer;

public class SMSObserver implements Observer {

	@Override
	public void update(Observable observable) {
		if (observable instanceof IphoneObservable) {
			int stockCount = ((IphoneObservable) observable).getStockCount();
			System.out.println("sms sent, stock count: " + stockCount);
		}
	}

}
