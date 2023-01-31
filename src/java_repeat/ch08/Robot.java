package java_repeat.ch08;

//인터페이스는 1) 양식의 역할 --> 표준화
//			2) class 와 class를 연결해줌(중요)
//			3) 다중상속 지원

public interface Robot {
//관련있는것들끼리 매핑하기 위한 인터페이스	
}

class DanceRobot implements Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class DrawRobot implements Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
class SingRobot implements Robot {
	void sing() {
		System.out.println("노래를 부릅니다.");
	}
}