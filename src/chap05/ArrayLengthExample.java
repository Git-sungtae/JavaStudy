package chap05;

public class ArrayLengthExample {
	public static void main(String[] args) {
	
		int[] intArray = new int[5];
		//배열타입 변수이름 = new 배열타입[배열길이];
		//이럴경우 길이가 5이고 0으로 채워진 int배열(int가 기본변수)이 생성
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
		}
		//0으로 초기화된지 확인
		System.out.println();
		
		
		String[] strArray = new String[5];
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		//이럴경우 길이가 5이고 null로 채워진 String배열(String이 참조변수이므로)이 생성
		//null으로 초기화된지 확인
		System.out.println();
		
		boolean[] boolArray = new boolean[5];
		for (int i = 0; i < boolArray.length; i++) {
			System.out.print(boolArray[i]);
		}
		
		//논리타입은 false로 들어간 것을 볼 수 있다.
		System.out.println();
		System.out.println("-----------------------------------");
		
		int[] intArray2 = {1, 2, 3};
		int[] intArray3 = new int[3];
		
		for (int i = 0; i < intArray3.length; i++) {
			System.out.print(intArray3[i]);
		}
		System.out.println();
		
		for (int value : intArray3) {
			value = value+10;
			System.out.print(value);
		}
		
		//(int i : 배열 변수명) : 첫번째 인덱스부터 한개씩 값을 가져옴
		// 169p 향상된 for문 참고
		
		
		
		
}
}
