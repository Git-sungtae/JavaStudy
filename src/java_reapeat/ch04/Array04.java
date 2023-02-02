package java_reapeat.ch04;

public class Array04 {

	public static void main(String[] args) {
		
		//2행 3열의 2차원 배열
		String[][] a = new String[2][3];
		a[0][0] = "00";
		a[0][1] = "01";
		a[0][2] = "02";
		a[1][0] = "10";
		a[1][1] = "11";
		a[1][2] = "12";
		
		//2차원배열의 길이 = 행의길이
		System.out.println("a 배열의 길이 = 행의길이 : " + a.length);
		//a[i]의 길이 = 열의 길이
		System.out.println("a[0]의 길이 = 열의 길이 : " + a[0].length + "\na[1]의 길이 = 열의 길이 : " + a[1].length);
		
		System.out.println("========<for문>========");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "] : " + a[i][j]);
			}
		}
		
		//foreach문으로 출력
		System.out.println("========<foreach문>========");
		int row = 0;
		int column = 0;
		for (String[] ss : a) {
			for (String s : ss) {
				System.out.println("a[" + row + "][" + column++ + "] : " + s);
			}
			row++;
		}
		
	}

}
