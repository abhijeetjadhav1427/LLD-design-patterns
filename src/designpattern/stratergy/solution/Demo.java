package designpattern.stratergy.solution;


public class Demo {
	public static void main(String[] args) {
		Vehicle normalVehicle = new NormalVehicle(new NormalDrive());
		Vehicle sportsVehicle = new SportsVehicle(new SportsDrive());
		Vehicle offroadVehicle = new OffroadVehicle(new SportsDrive());
		
		normalVehicle.drive();
		sportsVehicle.drive();
		offroadVehicle.drive();
	}
}
