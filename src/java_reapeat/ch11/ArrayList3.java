package java_reapeat.ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		System.out.println("요소의 개수 : " + list.size());
		System.out.println(">> Iterator 객체로 요소 얻기 <<");
		
		Iterator elements = list.iterator();
		//.hasnext() : 요소가 있으면 true
		//.next() : 요소를 가져옴
		while (elements.hasNext()) {
			System.out.println(elements.next());
		}
		
		System.out.println("\n");
		System.out.println(">> get 메서드로 요소 얻기 <<");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
	}

}
