package chap05_practice_3;

public class ArrayInArray {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]); 
			}
		}
		
		char ch = 'A';
		char[][] alphabets = new char[2][13];
		for (int i = 0; i < alphabets.length; i++) {
			for (int j = 0; j < alphabets[i].length; j++, ch++) {
				alphabets[i][j] = ch;
				System.out.print(alphabets[i][j]);
			}
		}
		
	}

}
