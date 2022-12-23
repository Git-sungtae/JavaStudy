package chap07;

class Vehicle {
	
	int a;
	int b;
	int c;
	
	
	public void run() {
		System.out.println("차량이 달립니다.");
	}
	
}

class Driver {
	
	public Driver() {
		
	}
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

class Bus extends Vehicle {
	
	int a1;
	int b1;
	int c1;
	
	void jump(){
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}
	
	
}

class Taxi extends Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("택시가 달립니다.");
	}

}

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
//		Vehicle bus = new Vehicle();
		Taxi taxi = new Taxi();
		
		Vehicle v1 = bus;
//		v1.a1;
//		v1.b1;
		
//		v1.run();
		
		
		
//		bus.run();
//		taxi.run();
//		
//		driver.drive(bus);
////		driver.drive(Vehicle);
//		driver.drive(taxi);
		
	}

}
