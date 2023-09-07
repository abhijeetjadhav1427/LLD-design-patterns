package designpattern.observer;

public class EmailObserver implements Observer {

	@Override
	public void update(Observable observable) {
		if (observable instanceof IphoneObservable) {
			int stockCount = ((IphoneObservable) observable).getStockCount();
			System.out.println("Email sent, stock count: " + stockCount);
		}
	}
	
}
