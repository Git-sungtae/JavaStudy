package chap07;

class Parent{
//필드
	int parentField = 99;
//생성자

//메서드
	void parentMethod() {
		System.out.println("부모 메소드");
	}
	
	void parentMethod2() {
		System.out.println("부모 메소드2");
	}
	
}

class ChildA extends Parent{
	
	int childAField;
	
	void childAMethod() {
		
	}

	@Override
	void parentMethod2() {
		// TODO Auto-generated method stub
		System.out.println("ChildA의 오버라이드 된 메소드");
	}
	
	
	
}


class ChildB extends Parent{
	int childBField;
	
	void childBMethod() {
		
	}
	
	@Override
	void parentMethod2() {
		// TODO Auto-generated method stub
		System.out.println("ChildB의 오버라이드 된 메소드");
	}
	
}

class ChildC extends Parent{
	int childCField;
	
	void childCMethod() {
		
	}
	
	@Override
	void parentMethod2() {
		// TODO Auto-generated method stub
		System.out.println("ChildC의 오버라이드 된 메소드");
	}
	
}


public class PolyExample {

	public static void main(String[] args) {
		//자식 A,B,C 객체 생성
		ChildA a = new ChildA();
		ChildB b = new ChildB();
		ChildC c = new ChildC();
		//부모타입으로 자동형변환
		Parent p1 = a;
		Parent p2 = b;
		Parent p3 = c;
		//형변환 후 자식클래스의 멤버 사용 → 컴파일에러
//		p1.childAField;
//		p2.childBField;
//		p3.childCField;
		
//		p1.childAMethod();
//		p2.childBMethod();
//		p3.childCMethod();
		
		//오버라이딩 된 자식클래스 메서드 사용
		System.out.println("오버라이딩 된 자식클래스 메서드 사용");
		p1.parentMethod2();
		p2.parentMethod2();
		p3.parentMethod2();
		System.out.println("=============================");
		
		//형변환 후 부모클래스의 멤버 사용 → 사용가능
		System.out.println("형변환 후 부모 필드 호출");
		System.out.println(p1.parentField);
		System.out.println(p2.parentField);
		System.out.println(p3.parentField);
		System.out.println("=============================");
		
		System.out.println("형변환 후 부모 메서드 호출");
		p1.parentMethod();
		p2.parentMethod();
		p3.parentMethod();
		System.out.println("=============================");
		
		
	}//메인
}//클래스
