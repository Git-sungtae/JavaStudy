package java_reapeat.ch05;

class Var{
	//클래스 변수
	static int k;
	//인스턴스 변수, Member 변수, 필드
	String color = "멋있어";
	int speed = 33;
	
	void scope() {
		//지역변수
		int s = 77;
		System.out.println(s + "scope method");
	}
}

public class Variable {

	public static void main(String[] args) {

		Var.k = 10;
		Var var1 = new Var();
		var1.speed = 55;
		System.out.println("speed k-> " + var1.k);
		System.out.println("speed-> " + var1.speed);
		var1.scope();
		
	}

}
