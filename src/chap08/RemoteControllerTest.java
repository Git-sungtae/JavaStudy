package chap08;

public class RemoteControllerTest {

	public static void main(String[] args) {

		//인터페이스에서 TV와 Audio 전원 켜기
//		RemoteController interface1;
		RemoteController interface1 = new Tv();
		interface1.turnOn();
		
		interface1 = new Audio();
		interface1.turnOn();
		
	}

}
