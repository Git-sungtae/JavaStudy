package chap04;

public class WhileExample {

	public static void main(String[] args) {
		// while문 써보기
		// while 조건이 true인 한 계속 반복
		// false 일 경우 while문을 나옴
		int count = 1;
		int sum = 0;
		
		while (count <= 100) {
			if (count % 2 == 0) {
				sum += count;
			}
			count++;
		}
		
		System.out.println(sum);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
