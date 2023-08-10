package designpattern.conditionalsynchronization;

public class Consumer extends Thread {
	private SharedData data;

	public Consumer(SharedData data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Consumed: " + this.data.consume());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
