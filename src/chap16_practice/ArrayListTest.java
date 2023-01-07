package chap16_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream= sList.stream();
		stream.forEach(s -> System.out.println(s));
		System.out.println("=====================");
		
		//sorted는 coparable 인터페이스가 구현된 클래스에만 사용 가능
		//String에서 구현된 compareTo에 따라, 오름차순으로 정렬됨
		sList.stream()
			.sorted()
			.forEach(s -> System.out.println(s));
		
	}

}
