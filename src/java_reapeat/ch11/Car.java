package java_reapeat.ch11;

public class Car {

	public void print() {
		System.out.println("난 " + this.getClass().getSimpleName() + "야");
	}

}

class Taxi extends Car {

}

class Bus extends Car {
	public void move() {
		System.out.println("move()");
	}

}