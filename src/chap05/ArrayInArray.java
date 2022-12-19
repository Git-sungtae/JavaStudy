package chap05;

public class ArrayInArray {
	public static void main(String[] args) {
		
		//다차원 배열 선언해보고, 값 입력해보기(string 타입으로)
		
		String[][] arr = new String[2][3];
//		String num = "0";
		for (int i = 0; i < arr.length;i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				String stri = Integer.toString(i);
				String strj = Integer.toString(j);
				String str = stri + strj;
				
//				String str2 = Integer.toString(i+j);
				
				arr[i][j] = str; 
				
				System.out.println(i + "행 " + j + "열의 값은: " +arr[i][j]);
				
				
				
			}
		}
		
	}
}
