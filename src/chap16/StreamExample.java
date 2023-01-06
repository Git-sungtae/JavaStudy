package chap16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("장성태");
		arrList.add("김태산");
		arrList.add("김영광");
		
		//arrList.stream().forEach(name -> System.out.println(name));
		Stream<String> strStream = arrList.stream();
		strStream.forEach(name -> System.out.println(name));
		
	}

}
