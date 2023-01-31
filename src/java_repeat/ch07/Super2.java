package java_repeat.ch07;

class Parent1{
	Parent1(){
		System.out.println("매개변수 없는 부모 생성자");
	}
	
	Parent1(String str){
		System.out.println("매개변수 있는 부모 생성자 1 str --> " + str);
	}
	
	void parentPrint() {
		System.out.println("parentPrint 야호! 월요일이다!");
	}
}

class Child1 extends Parent1{
	Child1(){
		super("헐~~");
		System.out.println("매개변수 없는 자식 생성자");
	}
	
	void childCc1(){
		System.out.println("cc1 야호! 월요일이다");
	}
	
	void childCc2(){
		System.out.println("cc2 자식 Method cc2");
	}
}

public class Super2 {
	
	public static void main(String[] args) {
		
		Child1 child1 = new Child1();
		child1.childCc2();
		child1.childCc1();
	}

}
