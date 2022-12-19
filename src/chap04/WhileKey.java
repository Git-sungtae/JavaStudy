package chap04;

public class WhileKey {

	public static void main(String[] args) throws Exception {
//		//while 안의 조건문이 계속 true이면 while은 무한루프를 돌게 된다.
//		//
//		int i = 1;
//		while (i<10) {
//			
//		}

		//키보드코드 코딩해보기
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if (keyCode!=13 && keyCode!=10) {
				System.out.println("----------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49) {
				speed ++;
				System.out.println("현재속도: " + speed);
			} else if(keyCode==50){
				speed --;
				System.out.println("현재속도: " + speed);
			} else if(keyCode==51) {
				run = false;
			}
			
			
			
			
		}
		
		
		System.out.println("프로그램종료");

		
		
		
		
	}

}
