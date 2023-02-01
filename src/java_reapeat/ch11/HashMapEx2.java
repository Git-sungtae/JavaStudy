package java_reapeat.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("손흥민", "010-3333-3333");
		hm.put("김준수", "010-2222-3456");
		hm.put("조정은", "010-3456-7890");
		
		System.out.println("==============<KeySet-for문 이용>==============");
		Set<String> st = hm.keySet();
		for (String string : st) {
			System.out.println(string + "의 전화[Set] : " + hm.get(string));
		}
		
		System.out.println("==============<Iterator 이용>==============");
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "의 전화[Iterator] : " + hm.get(key));
		}
		
		System.out.println("==============<Entry 이용>==============");
		for (Entry<String, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + "의 전화[Entry]" + entry.getValue());
		}
		
	}

}
