package designpattern.nullibjectpattern;

public class Demo {
	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getVehicle("car");
		printVehicle(car);
		
		System.out.println();
		Vehicle bike = VehicleFactory.getVehicle("bike");
		printVehicle(bike);
	}

	private static void printVehicle(Vehicle vehicle) {
		System.out.println(vehicle.getTankCapacity());
		System.out.println(vehicle.getSeatingCapacity());
	}
}
