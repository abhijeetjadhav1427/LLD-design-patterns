package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
	public List<Observer> observers;
	private int stockCount;

	public IphoneObservable() {
		super();
		this.observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(this);
		}
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount += stockCount;
		if(this.stockCount > 0) {
			notifyObservers();
		}
	}

}
