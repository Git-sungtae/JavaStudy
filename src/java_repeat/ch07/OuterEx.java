package java_repeat.ch07;

import java_repeat.ch07.Outer.Inner;

public class OuterEx {

	public static void main(String[] args) {

		Outer out1 = new Outer(100, 110);
		//getInner 메서드를 만들어서 호출하는 방법
		Outer.Inner in1 = out1.getInner();
		System.out.println("부피1 : " + in1.volumn());
		
		Outer out2 = new Outer(100, 120);
		//외부 클래스 객체로 접근하여 new Inner() 하는 방법
		Outer.Inner in2 = out2.new Inner();
		System.out.println("부피2 : " + in2.volumn());
		
	}

}
