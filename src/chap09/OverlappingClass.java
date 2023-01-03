package chap09;

class A{
	A(){
		System.out.println("A객체가 생성됨");
	}
	class B{
		B(){
			System.out.println("B객체가 생성됨");
		}
		int field = 1;
		
	}
	
	static class C{
		static int field = 5;
		static void method1(){
			System.out.println("스태틱 중첩클래스의 스태틱 메서드");
		}
	}
}

public class OverlappingClass {

	public static void main(String[] args) {
		//중첩클래스의 접근 A.X(대문자) 로 접근
		System.out.println("====<인스턴스 객체 클래스>====");
		//인스턴스 멤버 클래스인 B클래스의 인스턴스 생성방법
		//외부클래스 A의 인스턴스 먼저 만들어야함
		A a = new A();
		A.B b = a.new B();
		System.out.println(b.field);
		
		System.out.println("====<static 중첩 클래스>====");
		//static 중첩클래스는 외부클래스 A의 객체 없이도 생성가능
		A.C c = new A.C();
		//스태틱 중첩 클래스의 멤버 객체생성없이 호출 가능
		System.out.println(A.C.field);
		A.C.method1();
	}

}
