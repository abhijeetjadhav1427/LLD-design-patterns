package designpattern.conditionalsynchronization;

public class SharedData {
	private int data;
	private boolean writable = true;

	public synchronized void produce(int d) {
		if (!writable) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = d;
		System.out.println("Produced : " + d);
		writable = false;
		notify();
	}

	public synchronized int consume() {
		if (writable) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		writable = true;
		notify();
		
		return this.data;
	}
}
