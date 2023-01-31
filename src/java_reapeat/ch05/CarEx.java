package java_reapeat.ch05;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "빨강";
		myCar.speed = 200;
		myCar.speedUp();
		myCar.print();
		
		Car yourCar;
		yourCar = new Car();
		yourCar.color = "초록";
		yourCar.speed = 150;
		yourCar.speedUp();
		yourCar.print();
		
	}

}
