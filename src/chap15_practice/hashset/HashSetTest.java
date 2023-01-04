package chap15_practice.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		
		System.out.println(set);//순서대로 나오지 않는다
		
		boolean b2 = set.add("AAA");
		
		System.out.println(set);//중복값은 저장하지않는다
		
		System.out.println(b1);//true
		System.out.println(b2);//false
		
	}

}
