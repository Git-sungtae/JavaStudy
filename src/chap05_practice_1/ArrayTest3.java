package chap05_practice_1;

public class ArrayTest3 {

	public static void main(String[] args) {

		char[] alphabet = new char[26];
		char ch = 'A';//65
		
		for (int i = 0; i < alphabet.length; i++, ch++) {
			alphabet[i] = ch;
			System.out.print(alphabet[i]+ " ");
		}
		
	}

}
