package java_reapeat.ch12;

class G1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.println(currentThread().getName());
		System.out.println();
	}
	
	
}

class G2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print("+");
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println();
	}
}


class G3 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print("*");
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println();
	}
}



public class ThreadTestHw5 {

	public static void main(String[] args) {

		G1 g1 = new G1();
		g1.setName("g1 스레드");
		Thread g2 = new Thread(new G2(), "g2 R스레드");
		g2.setName("영광스레드");
		Thread g3 = new Thread(new G3(), "g3 R스레드");
		g3.setName("감사할 줄 모르는 영광스레드");
		
		g1.start();
		g2.start();
		g3.start();
		
	}

}
