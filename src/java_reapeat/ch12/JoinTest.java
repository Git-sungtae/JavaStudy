package java_reapeat.ch12;

//스레드가 정해진 순서로 실행되게 예제

import java.util.ArrayList;

class Before extends Thread{
	public Before(String str) {
		super(str);
	}
	
	@Override
	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		addCar();
	}
	
	void addCar() {
		System.out.println("add Car");
		JoinTest.carList.add("벤츠");
		JoinTest.carList.add("아우디");
		JoinTest.carList.add("롤스로이스");
		JoinTest.carList.add("벤츠");
	}
	
}

class After extends Thread{
	public After(String str) {
		super(str);
	}
	
	@Override
	public void run() {
		System.out.println("After Thread 이름 : " + getName());
		for (String car : JoinTest.carList) {
			System.out.println(car);
		}
	}
}



public class JoinTest {
	
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {

		Before bf = new Before("먼저");
		After af = new After("나중");
		//먼저 시작할 스레드 시작
		bf.start();
		
		try {
			//.join() 해당 메서드가 종료될 때 까지 기다림
			bf.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		af.start();
		
	}

}
