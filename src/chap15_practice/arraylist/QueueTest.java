package chap15_practice.arraylist;

import java.util.ArrayList;

class myQueue{

	private ArrayList<String> arrayQueue = new ArrayList();

	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int length = arrayQueue.size();
		if (length == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		//remove와 get의 차이점에 유의
		//remove는 큐에서 사라지고 get은 사라지지않음
		return arrayQueue.remove(0);
	}
	
	public String peek() {
		int length = arrayQueue.size();
		if (length == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayQueue.get(0);
	}
	
}


public class QueueTest {

	public static void main(String[] args) {

		
		
	}

}
