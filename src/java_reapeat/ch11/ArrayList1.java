package java_reapeat.ch11;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("히터 전원 끈 김영광");
		al.add("히터 전원 킨 김영광");
		al.add("히터 바람 킨 김영광");
		al.add("히터 바람 끈 김영광");
		al.add("히터 아작 낸 김영광");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + 1 + "번째 요소: " + al.get(i));
		}
		
		for (String string : al) {
			
			System.out.println(al.indexOf(string) +1  + "번째 요소: " + string);
		}
		
	}

}
