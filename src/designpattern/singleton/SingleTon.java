package designpattern.singleton;

public class SingleTon {
	private static volatile SingleTon instance = null; // Lazy Loading
	
	private SingleTon() {
		if(instance != null) throw new RuntimeException("Error!!..");
	}
	public static SingleTon getInstace() {
		if(instance == null) {
			synchronized (SingleTon.class) {
				if (instance == null)
					instance = new SingleTon();
			}
		}
		
		return instance;
	}
}
