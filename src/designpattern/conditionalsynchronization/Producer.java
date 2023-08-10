package designpattern.conditionalsynchronization;

public class Producer extends Thread {
	private SharedData data;

	public Producer(SharedData data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			this.data.produce(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
