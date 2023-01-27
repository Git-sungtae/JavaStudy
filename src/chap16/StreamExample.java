package chap16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collector.Characteristics;

class Product{
	String name;
	int count;
	double sellAverage;
	
	public String toString() {
		return "name: "+ this.name + " / count: " + this.count;
	}
	
	public double getSellAverage() {
		return sellAverage;
	}

	public void setSellAverage(double sellAverage) {
		this.sellAverage = sellAverage;
	}

	public Product(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}

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
		//장성태,김영광,김태산
		
		//Stream.generate
		//Supplier<T>에 해당하는 람다로 값이 넣어진 스트림 생성
		//크기가 정해져있지않고 무한하기때문에 limit으로 최대크기 제한
		Stream<String> generateStream = 
				Stream.generate(()->"gen").limit(5);
		//gen, gen, gen, gen, gen    
		
		//Stream.iterate
		//초기값을 받고 람다식을 수행한 값이 다음 요소의 인풋으로 들어가는 무한한 스트림 생성
		//limit으로 사이즈 제한
		Stream<Integer> iterateStream = Stream.iterate(10, n -> n+1).limit(5);
		//11,12,13,14
		
		//Pattern.splitStream
		//정규식으로 가공한 요소들로 이루어진 스트림 만들기
		Stream<String> regExStream =
				Pattern.compile(", ").splitAsStream("가, 나, 다");
		//가,나,다
		
		//parallelStream
		//병렬스트림 생성과 병렬여부 확인
		List<String> productList = new ArrayList<String>();
		Stream<String> parallelStream = productList.parallelStream();
		boolean isParallel = parallelStream.isParallel();
		//true
		
		//sequential()
		//다시 직렬스트림으로 변환해줌
		parallelStream.sequential();
		boolean isParallel2 = parallelStream.isParallel();
		//false
		
		//Stream.concat
		//두개의 스트림을 연결하여 새로운 스트림을 만듬
		Stream<String> stream1 = Stream.of("가","나","다");
		Stream<String> stream2 = Stream.of("라","마","바");
		Stream<String> stream3 = Stream.concat(stream1, stream2);
		//가,나,다,라,마,바
		
	//중간처리
		//사용할 리스트
		List<String> names = Arrays.asList("Eric", "Elena", "java");
		
		//Filtering
		//Stream<T> filter(Predicate<? super T> predicate);
		Stream<String> filterStream =
				names.stream()
				.filter(name -> name.contains("a"));//Elena,Java
		
		//Mapping
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		Stream<String> mappingStream =
				names.stream()
				.map(String::toUpperCase);//ERIC, ELENA, JAVA
		
		Stream<Integer> mappingStream2 = 
				names.stream()
				.map(s -> Integer.parseInt(s));
		
		//FlatMapping
		//중첩구조를 한단계 제거하고 단일 컬렉션으로 만들어주는 역할
		//<R> Stream<R> flatMap(Function<? super T, ? extends Stream <? extends R>> mapper);
		List<Product> pList = new ArrayList<Product>();
		pList.add(new Product("연필",1));
		pList.add(new Product("지우개",1));
		pList.add(new Product("볼펜",1));
		
		Stream<String> flatMappingStream = pList.stream()
				.flatMap(pListInstance -> Stream.of(pListInstance.getName()));
		
		//Sorting
		//매개변수없이 사용 sorted() → 오름차순 정렬
		//comparator 구현객체를 매개변수로 넘김 → 구현부에 따라 정렬
		//Stream<T> sorted(Comparator<? super T> comparator);
		Stream<String> sortingStream = names.stream()
				.sorted(Comparator.reverseOrder())
				.map(String::toUpperCase);
		sortingStream.forEach(System.out::println);
		//Comparator 사용		
		List<String> sortedResult = names.stream()
				.sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		
		//Iterating
		//처리중간에 결과를 확인해 볼 때 사용
		//Stream<T> peek(Consumer<? super T> action);
		int sum = IntStream.of(7,2,1,7,8,9)
				.sorted()
				.peek(num -> System.out.print(num))
				.sum();
		
	//최종처리
		//Calculating
		//count(), sum(), min(), max(), average()
		Product pencil = new Product("연필", 1);
		DoubleStream.of(5.5,6.6,7.7,8.8,9.9)
				.average()
				.ifPresent(fi -> pencil.setSellAverage(fi));
		
		//Reduction
		//reduce()
		//Optional<T> reduce(BinaryOperator<T> accumulator);
		//T reduce(T identity, BinaryOperator<T> accumulator);
		//<U> U reduce(U identity, Bifunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
		//1)Optional<T> reduce(BinaryOperator<T> accumulator);
		names.stream()
			.reduce((s1, s2) -> s1 + "," + s2)
			.ifPresent(System.out::print);
		
		//2)T reduce(T identity, BinaryOperator<T> accumulator);
		int identityTen = IntStream.of(1,3,5)
				.reduce(10, (n1 , n2) -> n1 + n2);
		System.out.println("\n" + identityTen);
		
		//3)<U> U reduce(U identity, Bifunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
		//combiner는 병렬처리된 스트림에서만 작동하며, 각자 다른 쓰레드에서의 작업을 합치는 역할
		int parallelTen = Arrays.asList(1,2,3,5,67,8,6)
				//.parallel()은 스트림의 "작업"을 병렬처리
				//.parallel()
				//Collections.parallelStream은 "병렬 스트림"을 리턴
				.parallelStream()
				.reduce(0,
						Integer::sum,
						(t1, t2) -> {
							System.out.println("combiner called "+ t1 + ", " + t2);
							return t1 - t2;
						});
		//벙렬쳐리를 하면 요소의 뒤에서부터 값을 가져와서 계산
		System.out.println(parallelTen);//66

		int parallelTen2 = IntStream.of(1,2,3,5,67,8,6)
				//.parallel()은 스트림의 "작업"을 병렬처리
				//.parallel()
				//Collections.parallelStream은 "병렬 스트림"을 리턴
				.parallel()
				.reduce(
						(t1, t2) -> {
							System.out.println("combiner called "+ t1 + ", " + t2);
							return t1 - t2;
						})
				.getAsInt();
		System.out.println(parallelTen2);//66
		
		//Collecting
		List<Product> productList2 = Arrays.asList(
				new Product("potatoes", 23),
				new Product("orange", 14),
				new Product("lemon", 13),
				new Product("bread", 23),
				new Product("sugar", 13));
		
		//Collectors.toList()
		//스트림에서 작업한 결과를 담은 리스트를 리턴
		List<String> collectorCollection = 
				productList2.stream()
					.map(Product -> Product.getName())
					.collect(Collectors.toList());
		collectorCollection.forEach(System.out::println);
		
		//Collectors.joining
		//스트림에서 작업한 결과물을(요소들을) 이어붙인 요소로 리턴
		//Collector<CharSequence, ?, String> joining(CharSequence delimiter, CharSequence prefix,CharSequence suffix)
		//delimeter : 구분자, prefix : 결과 맨 앞에붙는 문자, suffix : 결과 맨 뒤에붙는 문자
		String joinResult = productList2.stream()
					.map(Product -> Product.getName())
					.collect(Collectors.joining("-","<",">"));
		System.out.println(joinResult);
		
		//Collectors.averagingInt()
		//Collectors.summingInt()
		//평균, 합을 도출하여 값을 리턴
		
		Integer summingValue = productList2.stream()
				.collect(Collectors.summingInt(Product::getCount));
		System.out.println(summingValue);
		
		Double averagingValue = productList2.stream()
				.collect(Collectors.averagingInt(Product::getCount));
		System.out.println(averagingValue);
		
		//Collectors.summarizingInt()
		//종합 통계를 내서 IntSummaryStatistics 타입으로 리턴
		IntSummaryStatistics summarizingValue = productList2.stream()
				.collect(Collectors.summarizingInt(Product::getCount));
		System.out.println(summarizingValue);
		summarizingValue.getAverage();
		summarizingValue.getCount();
		summarizingValue.getMax();
		summarizingValue.getMin();
		summarizingValue.getSum();
			
			
		//Collectors.groupingBy()
		//특정 조건으로 요소들을 그룹지을 수 있음
		//리턴타입은 Map타입
		//<T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> classifier)

		Map<Integer, List<Product>> groupingByMap = productList2.stream()
				.collect(Collectors.groupingBy(Product -> Product.getCount()));
		Iterator<Integer> it = groupingByMap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			List<Product> i = (List<Product>) groupingByMap.get(key);
			System.out.println(i);
		}
		
		//Collectors.partitioningBy()
		//boolean이 key값인 Map을 리턴
		//평가요소들을 true와 false 두가지로 나눌 수 있음
		Map<Boolean, List<Product>> partitioningMap = productList2.stream()
				.collect(Collectors.partitioningBy(el -> el.getCount() < 15));
		Iterator<Boolean> it2 = partitioningMap.keySet().iterator();
		while (it2.hasNext()) {
			Boolean key = it2.next();
			List<Product> i = (List<Product>) partitioningMap.get(key);
			System.out.println(i);
		}
		
		//Collectors.collectingAndThen()
		//특정타입으로 결과를 collect한 이후 추가 작업이 필요 할 경우 사용
		//<T,A,R,RR> Collector<T,A,RR> collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher) { ... })
		//finisher는 collect를 한 후 실행할 작업을 의미
		 System.out.println(productList2.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), el -> el.get(0) )));
		
		//Collector.of
		//<T, A, R> Collector<T, A, R> of(Supplier<A> supplier, → New Collector 생성 
        // 								BiConsumer<A, T> accumulator, → 두 값을 가지고 계산
        // 								BinaryOperator<A> combiner, → 계산한 결과를 수집하는 함수
        // 								Function<A, R> finisher,
        // 								Characteristics... characteristics)
		 
		//Collector 생성
		Collector<Product,?,LinkedList<Product>> toLinkedList =
				Collector.of(LinkedList::new,
						LinkedList::add,
						(first, second) -> {
							first.addAll(second);
							return first;
						}); 
		 
		LinkedList<Product> linkedListOfPersons = 
				productList2.stream()
				.collect(toLinkedList);
		
		//Matching
		//Predicate 람다식을 받아 조건을 만족하는 요소가 있는지 boolean을 리턴
		//anyMatch(), allMatch(), noneMatch()
		//boolean anyMatch(Predicate<? super T> predicate);
		//boolean allMatch(Predicate<? super T> predicate);
		//boolean noneMatch(Predicate<? super T> predicate);
		
		boolean anyMatch = names.stream()
				.anyMatch(name -> name.contains("a"));
		boolean allMatch = names.stream()
				.allMatch(name -> name.length() > 3);
		boolean noneMatch = names.stream()
				.noneMatch(name -> name.endsWith("s"));
		
		//Iterating
		//foreach()
		//보통 System.out.println();를 통해 출력할 때 사용
		names.stream().forEach(System.out::println);
		
	}//메인

}
