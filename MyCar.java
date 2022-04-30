package week3.day1;

public class MyCar {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.applyBrake();
		vehicle.soundHorn();
		
		Car car = new Car();
		car.handBrake();
		car.turnAC();
		
		BMW bmw = new BMW();
		bmw.autoPark();
		
	}
}
