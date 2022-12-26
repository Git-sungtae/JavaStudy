package chap07_practice;
//추상메서드를 가지면 반드시 추상클래스여야 한다. 반대로, 추상클래스는 반드시 추상메서드를 갖지 않아도 된다.
public abstract class Computer { 
	public abstract void display();
	//{}를 안쓴다. 구현을 안하고 선언만 하겠다. 구현을 안한다 = 추상메서드
	//이 기능이 어떻게 구체적으로 작동하는지는 이 클래스에서 알수가없을 때 사용함
	//상속받는 하위객체들에게 구현의무가있음
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
}


class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display");		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing");
	}
	
}

abstract class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("NoteBook display");
	}


	
}


