package chap07;

class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	// 생성자

	// 메서드
	int run() {
		System.out.println("자동차가 달립니다.");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}

		return 0;

	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}

class Tire {
	// 필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메서드
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}

class HTire extends Tire {
	// 필드

	// 생성자
	public HTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메서드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HTire 펑크 ***");
			return false;
		}

	}

}

class KTire extends Tire {
	// 필드

	// 생성자
	public KTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메서드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KTire 펑크 ***");
			return false;
		}
	}
}

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HTire로 교체");
				car.frontLeftTire = new HTire("앞왼쪽", 15);
				break;

			case 2:
				System.out.println("앞오른쪽 KTire로 교체");
				car.frontRightTire = new KTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HTire로 교체");
				car.backLeftTire = new HTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KTire로 교체");
				car.frontRightTire = new KTire("뒤오른쪽", 17);
				break;
			}

			System.out.println("============================");
		}

	}// 메인
}// 클래스
