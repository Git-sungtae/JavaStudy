package chap15_practice.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList();
	
	public void push(String data) {
		//ArrayList가 List형 자료구조이기때문에
		//그냥 add()해도 스택형으로 자료가 저장됨
		arrayStack.add(data);
	}
	
	public String pop() {
		//null확인을 안해주면, 스택이 비었을 때에
		//IndexOutOfBounds 예외가 발생한다.
		int length = arrayStack.size();
		if (length == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
//		if (arrayStack.isEmpty()) {
//			System.out.println("스택이 비었습니다.");
//			return null;
//		}
		//n-1번째 인덱스에 있는 값이 스택의 Top부분에 해당하므로
		//remove를 통해 꺼내준다.
		//그 전에, 스택이 비었을 경우를 대비하여 로그를 찍어준다.
		String data =  arrayStack.remove(length-1);
		return data;
	}
	//peek은 get을 사용한다.(큐에서 데이터가 남아있음)
	public String peek() {
		int length = arrayStack.size();
		if (length == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		String data =  arrayStack.get(length-1);
		return data;
		
	}
	
	
}


public class StackTest {
	
	public static void main(String[] args) {

		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		//세번 꺼냄
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//스택이 비었음
		System.out.println(stack.pop());
		
	}

}
