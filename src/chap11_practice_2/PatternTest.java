package chap11_practice_2;

import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		//정규식 생성
		String regEx = "(02|010)-\\w{3,4}-\\w{4}";
		//검증대상
		String target = "010-2985-0246";
		//Pattern.matches(정규식,검증대상); → boolean값 리턴
		System.out.println(Pattern.matches(regEx, target));
		
		
	}

}
