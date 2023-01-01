package chap05_practice_3;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//<String>생략 가능
		//생략시 리스트의 리턴타입은 Object가 되기때문에, 명시해주는 것이 좋다.
		//값을 가져올때 String으로 downcasting 해야한다.
//		ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//list는 length가 아닌 size이다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("========================");
		
		for (String s : list) {
			System.out.println(s);
		}
	}

}
