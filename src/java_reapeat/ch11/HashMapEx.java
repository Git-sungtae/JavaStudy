package java_reapeat.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		//map에서의 추가는 put
		hm.put("손흥민", "010-3333-3333");
		hm.put("손영광", "010-2222-3333");
		hm.put("김영광", "010-3456-7890");
		hm.put("김영광2", "010-3456-7890");
		
		System.out.println("==============<Iterator 이용>==============");
		Iterator<String> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			String it = iterator.next();
			System.out.println(it + "\t tel : " + hm.get(it));
		}
		
		System.out.println("==============<Map.Entry이용>==============");
		
		for (Entry<String, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + "\t tel : " + e.getValue());
		}
		
//		System.out.println("손흥민\t tel: " + hm.get("손흥민"));
//		System.out.println("손영광\t tel: " + hm.get("손영광"));
//		System.out.println("김영광\t tel: " + hm.get("김영광"));
//		System.out.println("김영광2\t tel: " + hm.get("김영광2"));
		
	}

}
