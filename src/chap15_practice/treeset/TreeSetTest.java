package chap15_practice.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet tree = new TreeSet();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		//String은 Comparable을 구현을 이미 해놓았음
		System.out.println(tree);
		
	}

}
