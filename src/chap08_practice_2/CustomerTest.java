package chap08_practice_2;
//중복 default 메서드 오버라이딩 확인
//다형성 재확인(타입 바인딩이 달라도 메소드는 구현객체 메소드(바인딩 된 타입과 오버라이드로 연결된)가 실행됨) 
public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Buyable buyer = customer;
		System.out.println("Buyable 인터페이스타입과 바인딩");
		buyer.buy();
		buyer.sayHi();
		System.out.println("=================");
		
		Sellable seller = customer;
		System.out.println("Sellable 인터페이스타입과 바인딩");
		seller.sell();
		seller.sayHi();
		System.out.println("=================");
		
		System.out.println("구현객체에서의 실행");
		customer.sayHi();
		
	
		
	}

}
