package java_reapeat.ch08;

abstract class AbsClass{
	int kkk = 0;
	public void setKkk(int kkk) {
		this.kkk = kkk;
	}
	
	public AbsClass() {
		System.out.println("추상 Class 생성자");
	}
	
	abstract void print();
	
}


class ImplAbsClass extends AbsClass{

	@Override
	void print() {
		System.out.println("구현 메서드 오버라이드");
	}
	
}

public class Abstract1 {
	
	//추상클래스는 인스턴스화 할 수 없다.
	//추상메서드를 구현한 클래스만 인스턴스화 할 수 있다. → 구현클래스
	public static void main(String[] args) {
		AbsClass ac = new ImplAbsClass();
		ac.setKkk(10);
	}
	
	
}
