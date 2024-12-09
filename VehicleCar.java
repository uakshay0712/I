package inheretance;

public class VehicleCar extends Vehicle{
	public void drive() {
		System.out.println("Reparing a car");
	}

	public static void main(String[] args) {
		Vehicle v= new VehicleCar();
		v.drive();

	}

}
