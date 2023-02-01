package java_reapeat.ch12;

//1)Thread 클래스를 상속받아 생성하는방법
class ThreadExample1 extends Thread{
	
	public ThreadExample1(String str) {
		super(str);
	}
	
	@Override
	public void run() {
//CPU에게 시간을 할당받아 작업 할 내용을 run()메서드에 기술
		//super.run();
		for (int i = 1; i <= 100; i++) {
			//getName()	: 스레드의 이름을 리턴
			System.out.print(getName() + i + "\t");
			if (i % 10 == 0) {
				System.out.println();
			}
			try {
				//.sleep()
				//밀리초 = 0.001초
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();
		}
	}
	
}

public class ThreadTest1 {
	
	//main도 하나의 스레드로 작동함 
	public static void main(String[] args) {

		ThreadExample1 a1 = new ThreadExample1("subThreadA");
		ThreadExample1 a2 = new ThreadExample1("subThreadB");
		
		//start() : 디스크에있는 자바파일을 메모리에 올려보냄(스레드 단위로)
//		a1.start();
//		a2.start();
		a1.run();
		a2.run();
		
		for (int i = 1; i <= 100; i++) {
			System.out.print("Main " + i + "\t");
			if (i % 10 == 0 ) {
				System.out.println();
			}
			
		}
		
	}

}
