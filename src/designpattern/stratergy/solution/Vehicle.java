package designpattern.stratergy.solution;

public class Vehicle {
	public DriveStratergy driveStratergy;

	public Vehicle(DriveStratergy driveStratergy) {
		super();
		this.driveStratergy = driveStratergy;
	}
	
	public void drive() {
		driveStratergy.drive();
	}
}
