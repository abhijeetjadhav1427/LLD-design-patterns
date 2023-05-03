package designpattern.singleton;

public class Demo {
	public static void main(String[] args) {
		SingleTon singleTon1 = SingleTon.getInstace();
		
		System.out.println(singleTon1);
		
		SingleTon singleTon2 = SingleTon.getInstace();
		System.out.println(singleTon2);
	}
}
