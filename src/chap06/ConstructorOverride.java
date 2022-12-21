package chap06;

import java.util.Scanner;

class Cart{	
	//필드
	int cc=500;
	String color;
	String name;
	
	int blackStack = 5;
	int whiteStack = 5;
	
	
	//생성자
	//생성자는 객체생성시 초기화를 어떻게 할것인가 를 정의한다.
	public Cart() {
		
	}
	
	
	public Cart(String name) {
		this.name = name;
	}
	
	public Cart(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	//카트의 재고가 남아있는지 확인해보기
	boolean isLeft(String color){
		
		//if문
//		if(color.equals("검정색") && blackStack>0) {
//			System.out.println("검정색 카트의 재고가 남아있습니다.");
//			blackStack -= 1;
//		} else if(color.equals("검정색") && blackStack==0){
//			System.out.println("검정색 카트의 재고가 없습니다.");
//		} else if(color.equals("흰색") && whiteStack>0) {
//			System.out.println("흰색 카트의 재고가 남아있습니다.");
//			whiteStack -= 1;
//		} else if(color.equals("흰색") && whiteStack==0){
//			System.out.println("흰색 카트의 재고가 없습니다.");
//		} else {
//			System.out.println("매장에 없는 색상입니다.");
//		}
		
		//if-else로하니 복잡해서 switch문으로 변경
		//switch문 + scanner 사용
		boolean result=false;
		switch (color) {
		case "검": 
		case "검정" : 
		case "검정색":
			if (blackStack>0) {
				System.out.println("검정색 카트의 재고가 " + blackStack + "개 남았습니다.");
				result = true;
				blackStack -= 1;
				
			} else if(blackStack==0){
				System.out.println("검정색 카트의 재고가 없습니다.");
				result = true;
			}
			break;
			
		case "흰":
		case "흰색":
			if (whiteStack>0) {
				System.out.println("흰색 카트의 재고가 " + whiteStack + "개 남았습니다.");
				result = true;
				whiteStack -= 1;
			} else if(whiteStack==0){
				System.out.println("흰색 카트의 재고가 없습니다.");
				result = true;
			}
			break;
			
		case "종료":
			System.out.println("재고조회 프로그램을 종료합니다.");
			result = false;
			break;
			
		default:
			System.out.println("매장에 없는 색상입니다.");
			result = true;
			break;
		}
		
		return result;
		
	}
	
}

public class ConstructorOverride {

	public static void main(String[] args) {
		//메서드 오버라이딩
//		Cart cart = new Cart();
//		System.out.println(cart.name);
//		System.out.println(cart.color);
//		System.out.println(cart.cc);
//		
//		System.out.println("---------------------");		
//		
//		Cart cart2 = new Cart("카트");
//		System.out.println(cart2.name);
//		System.out.println(cart2.color);
//		System.out.println(cart2.cc);
		
		//재고확인 메서드 코딩
		Cart cart = new Cart();

		//스캐너를 사용해서 while문에 넣어 입력시 계속 스캐너 호출
		//"종료"를 입력했을 때만 false값을 리턴하는 불린타입으로 설정
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾으시는 색상을 입력하세요: ");
		String color = scanner.nextLine();
		
		while(cart.isLeft(color)) {
			System.out.print("찾으시는 색상을 입력하세요: ");
			String value = scanner.nextLine();
			color = value;
		}
		
		
		
		//scanner를 사용하지 않았을 때 일일히 조회하는 코딩
//		cart.isLeft("검정색");
//		cart.isLeft("검정색");
//		cart.isLeft("검정색");
//		cart.isLeft("검정색");
//		cart.isLeft("검정색");
//		cart.isLeft("검정색");
		
//		System.out.println("----------------------");
//		
//		cart.isLeft("노란색");
//		cart.isLeft("파란색");
//		
	}

}
