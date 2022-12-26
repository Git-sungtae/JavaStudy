package chap07;

class Parent{
	
	public String field1;
	
	public void method1() {
		System.out.println("Parend Method1()");
	}
	
	public void method2() {
		System.out.println("Parend Method2()");
	}
	
}

class Child extends Parent{
	
	public String field2;
	
	public void method3() {
		System.out.println("Child Method3()");
	}
	
}

public class UpcastingDowncasting {

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.field1 = "Parent field1";
		System.out.println(parent.field1);
		parent.method1();
		parent.method2();
		
		System.out.println("=========================");
		
		Parent parent2 = new Child();
		parent2.field1 = "Parent field1";
		System.out.println(parent2.field1);
		parent2.method1();
		parent2.method2();
//		
		System.out.println("=========================");
		
		Child child = (Child) parent2;
		child.field2 = "Child field2";
		System.out.println(child.field2);
		child.method3();
	}

}
