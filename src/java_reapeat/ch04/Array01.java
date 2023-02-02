package java_reapeat.ch04;

public class Array01 {

	public static void main(String[] args) {

		//크기가 5인 int 배열 생성
		int[] a = new int[5];
		//값 할당
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] = 67;
		
		//size측정
		System.out.println("배열의 길이" + a.length);
		//배열 출력
		int index = 0;
		for (int i : a) {
			System.out.println("a["+ index++ + "] : " +  i);
		}
		
		System.out.println("====================================");
		
		int[] b = new int[5];
		b[0] = 11;
		b[1] = 21;
		b[2] = 31;
		b[3] = 41;
		b[4] = 51;
		for (int i = 0; i < b.length; i++) {
			System.out.printf("b[%d] = %d\n",i , b[i]);
		}
		
	}

}
