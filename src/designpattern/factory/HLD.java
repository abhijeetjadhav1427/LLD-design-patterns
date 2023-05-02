package designpattern.factory;

public class HLD extends Course {

	@Override
	public void createCourse() {
		modules.add(new IntroModule());
		modules.add(new ExerciseModule());
		modules.add(new SummeryModule());
	}
}