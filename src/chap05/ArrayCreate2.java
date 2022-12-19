package chap05;

public class ArrayCreate2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		System.out.println(a);
		// 배열이 참조타입이므로 a의 주소가 출력됨

		for (int i = 0; i < a.length; i++) {
			a[i] = i;// a의 i번쨰 인덱스에 있는 곳에 i를 입력
			System.out.println(a[i]);

		}

		int sum = 0;
		float avg;
		
		int[] scores;
		scores = new int[] { 10, 20, 30 };
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		avg = sum / scores.length;
		
		String result;
		
		result = String.format("%.2f",avg);
		
		System.out.println(result);

	}
}
