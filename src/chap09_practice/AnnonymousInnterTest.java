package chap09_practice;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	//익명내부클래스를 변수에 대입하여 구현
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("runnable");
		}
		
	};
	
	public Runnable getRunnable(){
		int localNum = 100;
		//익명내부 클래스
		//로컬클래스에서 클래스 이름을 없앤 것
		//지역변수가 final인 특성도 그대로임
		return new Runnable() {
			@Override
			public void run() {
				//localNum은 final
//				localNum += 1;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		};
	}
}
public class AnnonymousInnterTest {

	public static void main(String[] args) {

		Outer2 outer2 = new Outer2();
		outer2.runnable.run();
		
		outer2.getRunnable().run();
		
	}

}
	