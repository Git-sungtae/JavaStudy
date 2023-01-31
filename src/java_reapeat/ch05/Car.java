package java_reapeat.ch05;
//클래스는 설계도다. 실행파일이 없기 때문이다.
public class Car {
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

	String color; //Member변수, 필드
	int speed;
	
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
	}
	
}
