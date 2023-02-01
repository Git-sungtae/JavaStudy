package java_reapeat.ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("표범");
		hs.add("사자");
		hs.add("호랑이");
		hs.add("하이에나");
		hs.add("표범");
		
		System.out.println("========<for each>========");
		for (String string : hs) {
			System.out.println(string);
		}
		
		System.out.println("========<Iterator>========");
		for (Iterator<String> iterator = hs.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
	}

}
