package playGround;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AiIsFuture {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		List<String> vowels = Arrays.asList(new String[]{"a","e","i","o","u"});
		
		char[] val1 = new char[st.length()];
		
		for (int i = 0; i < st.length(); i++) {
			if (vowels.contains(st.charAt(i))) {
				val1[i] = st.charAt(i);
			}
			
		}
		
	}

}
