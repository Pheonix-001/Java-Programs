package oops.abstraction;

public class RepairCar {
	
	static void repairCar(Car car) {
		System.out.println("car is repaired");
	}
	
//	static void repairCar(Audi car) {
//		System.out.println("car is repaired");
//	}

	public static void main(String[] args) {
		
		Audi audi = new Audi();
		
		WagnoR wagnor = new WagnoR();
		
		repairCar(audi);
		repairCar(wagnor);

	}

}
