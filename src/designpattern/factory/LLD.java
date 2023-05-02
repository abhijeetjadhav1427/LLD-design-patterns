package designpattern.factory;

public class LLD extends Course{

	@Override
	public void createCourse() {
		// TODO Auto-generated method stub
		modules.add(new IntroModule());
		modules.add(new DemoModule());
		modules.add(new SummeryModule());
	}
	
}
