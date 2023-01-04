package chap15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet();
		treeSet.add(90);
		treeSet.add(87);
		treeSet.add(80);
		treeSet.add(60);
		treeSet.add(100);
		
		System.out.println("====<내림차순 정렬>====");
		NavigableSet<Integer> downSet = treeSet.descendingSet();
		
		for (Integer i : downSet) {
			System.out.println(i);
		}
		
		System.out.println("====<오름차순 정렬>====");
		
		NavigableSet<Integer> upSet = downSet.descendingSet();
		for (Integer i : upSet) {
			System.out.println(i);
		}
		
		System.out.println("====<범위 검색>====");
		NavigableSet<Integer> subSet = treeSet.subSet(60, true, 90, false);
		for (Integer integer : subSet) {
			System.out.println(integer);
		}
		
		
	}

}
