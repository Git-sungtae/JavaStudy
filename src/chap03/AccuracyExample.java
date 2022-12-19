package chap03;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double result = apple - (pieceUnit*number);
		System.out.println(result);
//		console)0.29999999999999993
//		***실수타입은 0.1을 정확히 표현할 수 없어서 근사치로 처리하기 때문에
//		따라서 정확한 계산을 위해서는 정수형을 사용하여야한다.
		
		int totalPieces = apple *10;
		int temp = totalPieces - number;
		double result2 = temp/10.0;
//		실수리터럴인 0.1을 없애는 게 목적
		
		System.out.println(result2);
	}

}
