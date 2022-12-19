package chap04;

public class ForPrintExample {

	public static void main(String[] args) {
//1~9까지 출력해보자
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.print(6);
		System.out.print(7);
		System.out.print(8);
		System.out.print(9);
		
		System.out.println();
		
		//for문으로 같은 결과 얻어보기
		for (int i = 1 ; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		//for문의 조건식 변수타입을 부동소수타입을 사용하면 안됨(double, float)
		
		for (float j = 0.1f; j <= 1.0f; j+=0.1f) {
			System.out.print(j);
		}
	}

}
