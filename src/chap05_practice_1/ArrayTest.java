package chap05_practice_1;

public class ArrayTest {

	public static void main(String[] args) {
		//배열의 초기화
		//초기화시 할당한 데이터의 개수가 길이가 된다
		int[] numbers = new int[] {0,1,2};
		System.out.println(numbers.length);//3
		System.out.println("======================");
		//이런방식으로도 초기화가능(잘 쓰이지않음)
		int[] numbers2 = {0,1,2};
		//배열의 선언 + 길이 10인 배열 생성 → 아직 초기화는 안됨
		int[] arr = new int[3];
		//초기화
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		//for문으로 배열의 값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//배열을 선언 + 길이를 정해서 초기화를 하면,
		//배열 안의 값들은 타입에 맞게 초기화가 된다.
		System.out.println("<IntArr>");
		int[] intArr = new int[3];
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		System.out.println("<DoubleArr>");
		double[] doubleArr = new double[3];
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		
		System.out.println("<StringArr>");
		String[] StringArr = new String[3];
		for (int i = 0; i < StringArr.length; i++) {
			System.out.println(StringArr[i]);
		}
		
		System.out.println("<BooleanArr>");
		boolean[] booleanArr = new boolean[3];
		for (int i = 0; i < booleanArr.length; i++) {
			System.out.println(booleanArr[i]);
		}
		
		System.out.println("<ObjectArr>");
		Object[] ObjectArr = new Object[3];
		for (int i = 0; i < ObjectArr.length; i++) {
			System.out.println(ObjectArr[i]);
		}
		
		
		
		
		
		
	}

}
