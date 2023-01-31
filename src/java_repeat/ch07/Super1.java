package java_repeat.ch07;

class Parent {
	int a = 7;
	int b = 7;
	
	void display() {
		System.out.println("Parent 대박");
	}
	
	void print() {
		System.out.println("Parent 난 부모 print 메서드");
	}
	
}

class Child extends Parent {
	int a = 10;
	void print() {
		super.print();
		System.out.println("Child 부모멤버 a = " + super.a);
		System.out.println("Child 난 자식메서드 a = " + a);
		System.out.println("Child 난 자식메서드 b = " + b);
	}
}

public class Super1 {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.print();
		child.display();
		
	}

}
