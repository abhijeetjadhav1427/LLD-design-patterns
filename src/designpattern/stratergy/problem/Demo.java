package designpattern.stratergy.problem;

public class Demo {
	public static void main(String[] args) {
		Vehicle normalVehicle = new NormalVehicle();
		Vehicle sportsVehicle = new SportsVehicle();
		Vehicle offroadVehicle = new OffroadVehicle();
		
		normalVehicle.drive();
		sportsVehicle.drive();
		offroadVehicle.drive();
	}
}
