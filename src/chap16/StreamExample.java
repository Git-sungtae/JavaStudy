package chap16;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("장성태");
		arrList.add("김태산");
		arrList.add("김영광");
		
		//arrList.stream().forEach(name -> System.out.println(name));
		Stream<String> strStream = arrList.stream();
//		strStream.forEach(name -> System.out.println(name));
		
		BiPredicate<Integer,Integer> pr = (a,b) -> a>=b;
		System.out.println(pr.test(10, 20));
		
	}

}
