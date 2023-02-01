package java_reapeat.ch11;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {

		int i = 0;
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(52);
		ts.add(24);
		ts.add(72);
		ts.add(34);
		ts.add(52);
		
		for (Integer integer : ts) {
			i++;
			//입력된 순서가 유지되지 않는다. + 중복도 허용되지 않는다.
			System.out.println(i + "번째 t : " + integer);
		}
		
	}

}
