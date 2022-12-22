package chap06;

class CellPhone{
//필드	
	 String model;
	 String color;
//생성자
	 CellPhone() {
		 
	}
	 
	 CellPhone(String model, String color) {
		 this.model = model;
		 this.color = color;
	}
	
//메서드
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	
	
}

class iPhone extends CellPhone{
//상속

//필드
	int channel;
//생성자
	iPhone(String model, String color, int channel){
//		부모객체에 있는 필드 사용가능(this로도 사용가능)
//		this.model = model;
//		this.color = color;
//		부모객체에 기본생성자가 없고 선언된 생성자가 있으므로, 반드시 부모객체 생성먼저
//		super(파라미터 ...); 사용해서 생성자 호출
//		반드시 첫줄에 해야함
//		!기본생성자 + 다른 생성자가 같이있으면 안적어도 컴파일러가 기본생성자를 추가
		super(model, color);
		
//		this.model = model;
//		this.color = color;
		this.channel = channel;
	}
//메서드
	void turnOniPhone() {
		System.out.println("채널 " + channel + "번 방송 수신을 시작합니다.");
	}
	
	void turnOffiPhone() {
		System.out.println("iPhone을 멈춥니다.");
	}
	
	void changeChanneliPhone(int channel){
		this.channel = channel;
		System.out.println("채널을 " + channel + "번 으로 바꿉니다.");
	}
	
	void changeChanneliPhone(){
		
	}
	
	//CellPhone(부모객체)에 있는 자식객체가 메서드를 수정/보강해서하고싶을때
	//오버라이드를 한 후 사용하면 된다.
	//@Override
	@Override
	void powerOff(){
		//부모객체의 메서드 내용과아예 상관없음
		//상속시 똑같은 이름의 메서드를 사용하기만 하면 오버라이드
		System.out.println("5초후 종료합니다.");
	}
	
}

public class InheritanceExample {

	public static void main(String[] args) {
	
		iPhone i = new iPhone("아이폰", "검정", 10);
		
		//model과 color는 부모객체의 필드인데 호출 가능
		System.out.println("iPhone.model: "+ i.model);
		System.out.println("iPhone.color: "+ i.color);
		
		System.out.println("iPhone.channel: "+ i.channel);
		System.out.println("==========================");
		//powerOn, powerOff는 부모객체의 메서드인데 사용 가능
		i.powerOn();
		i.powerOff();
		
		i.turnOniPhone();
		i.turnOffiPhone();
		i.changeChanneliPhone(15);

		System.out.println("==========================");
		
		CellPhone cp = new CellPhone();
		System.out.println(cp.color);
		System.out.println(cp.model);
		
		
		
		
		
		
	}

}
