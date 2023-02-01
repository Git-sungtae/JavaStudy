package java_reapeat.ch11;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("손흥민", "010-3333-3333");
		ht.put("김준수", "010-2222-3456");
		ht.put("조정은", "010-3456-7890");
		
		for (Entry<String, String> e : ht.entrySet()) {
			System.out.println(e.getKey() + "\ttel : " + e.getValue());
		} 
		
	}

}
