package chap08_2;

public class RemoteControllerTest {

	public static void main(String[] args) {
		
		//추상클래스에서 TV와 Audio 전원 켜기
		RemoteController absClass1 = new Tv();
		absClass1.turnOn();
		absClass1 = new Audio();
		absClass1.turnOn();
	}

}
