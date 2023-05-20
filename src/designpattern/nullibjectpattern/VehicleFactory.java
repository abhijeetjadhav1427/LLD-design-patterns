package designpattern.nullibjectpattern;

public class VehicleFactory {
	public static Vehicle getVehicle(String vehicleType) {
		if (vehicleType.equals("car")) {
			return new Car();
		}
		return new NullObject();
	}
}
