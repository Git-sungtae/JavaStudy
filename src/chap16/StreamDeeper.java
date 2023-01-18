package chap16;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDeeper {
	static long counter;
	
	static void isCalled(){
		counter++;
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Eric", "Elena", "java");
		//스트림의 동작원리
		names.stream()
			.filter(el -> {
				System.out.println("filter called");
				return el.contains("a");
			})
			
			.map(el -> {
				System.out.println("map called");
				return el.toUpperCase();
			})
			.findFirst();
		//filter called
		//filter called
		//map called
		
		//한 요소가 중간처리 과정을 모두 거치고, 그 다음요소로 넘어가는 방식
		//즉, 한 요소씩 수직적으로 실행됨
		
		
		//스트림의 성능향상
		//요소의 범위를 줄이는 skip,filter,distinct를 먼저 사용하여야
		//호출되는 메서드가 적고, 불필요한 연산횟수를 줄인다.
		
		//map이 3번호출되는 코딩
		names.stream()
			.map(el -> {
				System.out.println("map called");
				return el.substring(0, 3);
			})
			
			.skip(2)
			.collect(Collectors.toList());
		
		//요소의 범위를 줄이는 skip을 먼저 호출하여 map을 1번 호출하도록 함
		names.stream()
			.skip(2)
			.map(el -> {
				System.out.println("map called");
				return el.substring(0, 3);
			})
			.collect(Collectors.toList());
		
		
		//스트림은 최종처리가되거나, 닫힌 이후에는 재사용이 불가능하다.
		//스트림의 중간처리를 통해 리덕션한 데이터들을 리스트에 저장하고
		//필요할 때마다 생성하여 사용하여야한다.
		List<String> list = names.stream()
				.filter(el -> el.contains("a"))
				.collect(Collectors.toList());
				
		Optional<String> oString = list.stream().findFirst();
		Optional<String> oString2 = list.stream().findAny();
		
		//지연연산
		//스트림의 연산은 최종처리가 실행될 때 계산된다.
		list.stream()
			.filter(el ->{
				isCalled();
				return el.contains("a");
			});
		//최종처리연산이 실행되지않아서 counter = 0
		System.out.println(counter);
		
		list.stream()
		.filter(el ->{
			isCalled();
			return el.contains("a");
		})
		.collect(Collectors.toList());
		//collect가 실행되어 2번의 filter의 연산이 실행됨
		System.out.println(counter);
		
		
		//Null-safe 스트림 확인
		List<String> nullList = null;
		collectionToStream(nullList)
			.filter(str -> str.contains("a"))
			.map(String::length)
			.forEach(System.out::println);
		//NPE 발생하지않음!
		
	}	
	
	
	//Null-safe 스트림 생성하기(Optional 활용)
	public static <T> Stream<T> collectionToStream(Collection<T> collection){
		return Optional
				//not null이면 매개변수타입의 Optional을 리턴
				//null이면 빈 스트림을 리턴하는 메서드
				.ofNullable(collection)
				//Optional이 넘어올 경우, 스트림으로 변환
				.map(Collection::stream)
				//값이존재할경우 → 존재하는 값 리턴(그대로 리턴)
				//값이 존재하지않을경우 → 구현메서드(Stream::empty) 리턴
				.orElseGet(Stream::empty);
	}
	
	
		
		
		
		
		
	

}
