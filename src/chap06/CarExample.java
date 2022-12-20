package chap06;

public class CarExample {
	public static void main(String[] args) {
		
//		Car myCar = new Car();
//		//Car 객체를 생성 한 후에 Car 클래스의 필드와 메소드에 접근 가능
//		
//		System.out.println("차량회사 : "+ myCar.company);
//		System.out.println("차량종류 : "+ myCar.model);
//		System.out.println("차량색상 : "+ myCar.color);
//		System.out.println("차량최속 : "+ myCar.maxSpeed);
//		System.out.println("현재속도 : "+ myCar.speed);
//		//현재속도 : 0
//		//!기화되지 않은 speed 필드는 생성자로 인해 객체가 생성될 때, 
//		//!자동으로 초기화된다.(int타입 초기화값인 0으로)
//		
//		myCar.speed = 60;
//		//생성자로 객체를 생성했으므로 Car객체 사용 가능
//		
//		System.out.println("현재속도 : "+ myCar.speed);
		
		//가스 예제 p223
		
//		Car myCar = new Car();
//		//Car객체의 setGas 메소드 호출
//		myCar.setGas(5);
//		
//		boolean gasState = myCar.isLeftGas();
//		if (gasState) {
//			System.out.println("출발합니다.");
//			myCar.run();
//		} 
//		
//		if (myCar.isLeftGas()) {
//			System.out.println("가스를 주입할 필요가없습니다.");
//		} else {
//			System.out.println("가스를 주입하세요");
//		}
		
		//235p 인스턴스멤버, this 예제
		
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.setModel("벤츠");
//		yourCar.setModel("그랜져");
		
		myCar.setSpeed(1);
		//1보다 작은 수를 입력하는것을 방지하는 if문을 삽입한 경우
		
//		yourCar.setSpeed(0);
		
		myCar.run2();
//		yourCar.run2();
				
		
		
	}

}
