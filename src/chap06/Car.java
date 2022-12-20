package chap06;

public class Car {
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//void 클래스에서 return의 역할

	//필드
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
		//this.gas에서 this. : "객체 안에있는" 이라는 뜻
		//this.gas의 gas는 13행의 gas를 의미하고
		//파라미터에 있는 int gas는 (객체 안에없는) 파라미터값임을 의미
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		
		System.out.println("가스가 있습니다.");
		return true;
		
	}
	
	void run() {
		while(true){
			if (gas > 0) {
				System.out.println("달립니다(남은 가스: " + gas + ")");
				gas = gas - 1;
			} else {
				System.out.println("멈춥니다(남은 가스: " + gas+ ")");
				return;
			}
			
		}
	}
		// void로 인해 메소드 강제종료
		
		//p235 인스턴스멤버, this 예제
		
//	String model;
//	int speed;
	
	
		
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void setModel(String model) {
		this.model= model;
	}
	
	void run2() {
		
			if (this.speed>0) {
				for (int i = this.speed; i < 50; i += 10) {
					this.setSpeed(i);
					System.out.println(this.model + "가 달립니다. 시속: " + this.speed);
				} 
			} else {
				System.out.println("양수를 입력하세요");
				return;
			}
			
	}

	
		
		
		
		
	
} //클래스
	
	

