package java_reapeat.ch11;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		String[] pet = {"강아지", "야옹이", "물고기", "야옹이"};
		Stack<String> st = new Stack<String>();
		for (String string : st) {
			System.out.println("push → " + string);
			st.push(string);
		}
		
	}

}
