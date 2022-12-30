package chap11;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String regExp2 = "[(02)|(010)]-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		
		System.out.println(Pattern.matches(regExp, data));
		System.out.println(Pattern.matches(regExp2, data));
		
		
		regExp = "\\w+@\\w+.\\w+(\\.\\w+)?"; 
		data = 	"asd123@asd.asd";	
		System.out.println(Pattern.matches(regExp, data));
		
		regExp = "\\w+@\\w+\\w+\\.\\w+";
		data = "angel@naverco.kr";
		System.out.println(Pattern.matches(regExp, data));
	}

}
