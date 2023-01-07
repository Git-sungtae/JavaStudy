package chap16_practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		//IllegalStateException 발생!
		//한번 사용한 스트림은 최종연산시 소모되기때문에 다른연산으로 재사용 불가
//		int count = (int)stream.count();
		//새로운 스트림을 만들어 사용해야함
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		
	}

}
