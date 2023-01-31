package java_reapeat.ch07;

public class Car2Ex {

	public static void main(String[] args) {
		Car2[] cars = new Car2[3];
		cars[0] = new Bus();
		cars[1] = new Ambulance();
		cars[2] = new FireEngine();
		
		for (Car2 car : cars) {
			car.move();
			System.out.println("for Car2--> " + car.a);
			System.out.println("for Car2--> " + car.a);
		}
		
		Bus bus = new Bus();
		System.out.println(bus.a);
//		bus.b
		
	}
	
	

}
