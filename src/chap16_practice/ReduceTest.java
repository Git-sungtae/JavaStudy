package chap16_practice;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//2) BinaryOpertor를 구현한 클래스를 만드는 방법
class CompareString<T> implements BinaryOperator<T>{

	@Override
	public T apply(T s1, T s2) {
		
		if (((String)s1).getBytes().length >= ((String) s2).getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}

}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"안녕하세요!!!", "Hello", "Good Morning", "반갑습니다"};
		//가장 긴 문자열을 찾는 연산을 구현
		//1)람다식을 직접 구현하는 방법
		String result = Arrays.stream(greetings).reduce("", (s1, s2)->{ 
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}
		);
		
		System.out.println(result);
		
		//BinaryOperator를 구현한 클래스를 만들어서 그 객체를 매개변수로 쓰는 방법(람다식 부분에)
										//BinaryOperator를 호출할 때는 초기값 생략 가능
//		System.out.println(Arrays.stream(greetings).reduce(new CompareString<>()));
		
	}

}
