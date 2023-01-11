package chap16;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		String[] strArr = new String[] {"a","b,","c"};
		Arrays.stream(strArr,1,3);
		
		//Stream.builder
		//원하는 값을 직접 넣은 스트림을 생성
		Stream<String> builderStream =
				Stream.<String>builder()
					.add("장성태")
					.add("김영광")
					.add("김태산")
					.build();

		builderStream.forEach(s -> System.out.println(s));
		
		//Stream.generate
		//Supplier<T>에 해당하는 람다로 값이 넣어진 스트림 생성
		//크기가 정해져있지않고 무한하기때문에 limit으로 최대크기 제한
		Stream<String> generateStream = 
				Stream.generate(()->"gen").limit(5);
		generateStream.forEach(s -> System.out.println(s));
		
		//Stream.iterate
		//초기값을 받고 람다식을 수행한 값이 다음 요소의 인풋으로 들어가는 무한한 스트림 생성
		//limit으로 사이즈 제한
		Stream<Integer> iterateStream = Stream.iterate(10, n -> n+1).limit(5);
		iterateStream.forEach(s -> System.out.println(s));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//메인

}
