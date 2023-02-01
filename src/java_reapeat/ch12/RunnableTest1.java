package java_reapeat.ch12;

class Runnable1 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "대박" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}

class Runnable2 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "월요일" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}



public class RunnableTest1 {

	public static void main(String[] args) {
		Runnable1 runnable1 = new Runnable1();
		Runnable2 runnable2 = new Runnable2();

		//implement 한 것은 반드시 아래와 같은 선언후 사용  --> Thread th1 = new thread(r1)
		//runnable로 구현했다고 표시하기 위해, 반드시 생성자의 매개변수에 표시
		Thread rThread1 = new Thread(runnable1, "Pr");
		Thread rThread2 = new Thread(runnable2, "no");
		
		rThread1.start();
		rThread2.start();
		
		
	}

}
