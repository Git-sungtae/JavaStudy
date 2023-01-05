package chap09_practice;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable(){
		//로컬 클래스의 지역변수는 final이다.
		//메서드가 종료되면 스택메모리에서 사라지기 떄문에
		//이를 해결하기 위해 자바가 상수풀에 넣고 관리하기 때문
		int localNum = 100;
		
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				//로컬 클래스의 지역변수들은 final이므로 변경하는 코딩을 하면 오류가난다.				
//				localNum += 1;

				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				
			}
			
		}
		
		return new MyRunnable();
		
	}
	
}

public class LocalInnerClassTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		//외부 클래스가 생성되고 메서드를 호출하면서 클래스안의 멤버와 메서드 사용 가능
		outer.getRunnable().run();
		
	}

}
