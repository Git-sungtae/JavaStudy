package chap02;

public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue;
			
		System.out.println(intValue);
		System.out.println();
		
		int intValue2 = 100;
		double doubleValue = intValue2;
		
		System.out.println(doubleValue);
//		실수형인 100.0으로 출력
		System.out.println();
		
		System.out.println(intValue + 10.0);
		System.out.println();
//		인트가 연산하기 전에 실수로 형변환 후 연산(자동형변환)

//		연산에 의한 자동형변환
		byte byteNum1 = 10;
		byte byteNum2 = 20;
//		byte byteNum3 = byteNum1 + byteNum2;
//		E! 연산시 자바 기본형인 int로 자동 형변환 되기 때문에 결과값도 int이다!
		int byteNum3 = byteNum1 + byteNum2;
		
		System.out.println(byteNum3);
		
	}

}
