package chap06;
import java.util.*;
public class CalculatorExample {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		//객체 생성
		cal.powerOn();
		//객체의 메소드 사용
		Scanner scanner = new Scanner(System.in);
		//스캐너
		System.out.println("첫번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();
		
		int result = cal.miltiple(num1, num2);
		
		System.out.println("두 숫자의 곱은: " + result);
		
		cal.powerOff();
		
	}
}
