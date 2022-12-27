package chap08_practice_2;
//다중 인터페이스 구현
interface Buyable {
	void buy();
	void value();
	
	public default void sayHi() {
		System.out.println("구매자가 인사합니다.");
	}

}

interface Sellable{
	void sell();
	void value();
	
	public default void sayHi() {
		System.out.println("판매자가 인사합니다.");
	}
	
}

public class Customer implements Buyable,Sellable{

	@Override
	public void sell() {
		System.out.println("판매 주문");
	}

	@Override
	public void buy() {
		System.out.println("구매 주문");
		
	}
	//추상메서드 명이 겹치는것은 상관없음!
	//어차피 구현식 작성은 구현객체의 실체메서드에서 작성하기 때문에!
	@Override
	public void value() {
		System.out.println("가격은 --원 입니다.");
	}
	//중복되는 default 메서드를 오버라이딩하여, Duplicate default methods 에러 해결
	@Override
	public void sayHi() {
		System.out.println("고객이 인사합니다.");
		
	}


	
}