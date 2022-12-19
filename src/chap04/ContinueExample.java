package chap04;

public class ContinueExample {
	public static void main(String[] args) {
		//contiue를 이용해 1~10까지 짝수만 출력
		int sum=0;
		for (int i = 1; i < 11; i++) {
			
			if (i%2 == 1) {
				continue;
			}
			
			System.out.println(i);
			sum += i;
		}
		
		System.out.printf("총합은 %d입니다",sum);
	}

}
