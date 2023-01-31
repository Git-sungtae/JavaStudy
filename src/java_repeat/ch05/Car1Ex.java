package java_repeat.ch05;

class Car1{
	
	String color;
	int speed;
	static int wheel;
	//static : 동일 클래스내의 모든 인스턴스들이 공유하는 변수 = "클래스 변수"
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void speedUp() {
		speed++;
		System.out.println(speed + " 속도를 올렸다.");
	}
	
	void speedDown() {
		speed--;
		System.out.println(speed + " 속도를 내렸다.");
	}
	
	void print() {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
		System.out.println("바퀴: " + wheel);
	}
	
	
}

public class Car1Ex {

	public static void main(String[] args) {

		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		
		c1.color = "빨강";
		c1.speed = 200;
		c2.color = "노랑";
		
		c1.print();
		
		Car1.wheel = 5;
		
		c2.print();
	}

}
