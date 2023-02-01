package java_reapeat.ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void print(ArrayList<String> listPrint) {
		
		for (String str : listPrint) {
			StringBuffer sb = new StringBuffer(str);
			System.out.print( sb.reverse().toString()+ "\t");
		}
		
		System.out.println("\n=======================================================");
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("나나바");
		list.add("박수");
		list.add("과사");
		list.add("나나바");
		list.add("박수");
		list.add("추대");
		list.add("나나바");
		
		System.out.println("개수 : " + list.size());
		print(list);
		
		list.add(1,"위키");
		System.out.println("개수 : " + list.size());
		print(list);
		
		list.set(1, "과사");
		System.out.println("개수 : " + list.size());
		print(list);
		
		list.remove(1);
		System.out.println("개수 : " + list.size());
		print(list);
		
		System.out.println("3번인덱스 출력 : " + list.get(3));
		
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			if (string.equals("박수")) {
				list.set(list.indexOf(string), "론메");
			}
		}
		
		print(list);
	}

}
