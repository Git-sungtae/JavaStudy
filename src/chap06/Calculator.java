package chap06;

public class Calculator {
	//219p
	//메소드 만들어보기
		
		void powerOn() {
			System.out.println("전원을 켭니다");
		}
		
		int add(int x, int y) {
			int result = x + y;
			return result;
		}
		
		int distract(int x, int y) {
			int result = x - y;
			return result;
		}
		
		int miltiple(int x, int y) {
			int result = x * y;
			return result;
		}
		
		double divide(int x, int y) {
			double result = (double) x / y;
			result = (Math.round(result*1000)) / 1000.0;
			return result;
		}
		
		//매개변수의 개수를 모르는 경우219p
//		int arrayMethod(int ... values) {
//			//...을 사용하면 해당타입의 입력된 값이 자동으로 배열이 생성되고 매개값으로 사용된다.
//			for(int i =0; i<values.length; i++) {
//			System.out.println(values[i]);
//			}
//			return 0;
//		}
		
		//매개변수의 개수를 모르는경우에 합을 구해주는 메소드
		int sum(int ... values) {
			int sum = 0;
			for (int i = 0; i < values.length; i++) {
				sum += i;
			}
			return sum;
		}
		
		//객체 내부에서의 메소드 호출
		//객체 내부 메소드를 호출할땐 그냥 메서드명으로 호출
		double avg(int x, int y) {
			double sum = add(x, y);
			double result = sum / 2;
			return result;
		}
		
		void powerOff() {
			System.out.println("전원을 끕니다");
		}
		
		
		
		
		
}
