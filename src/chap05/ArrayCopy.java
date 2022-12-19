package chap05;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//배열 복사
		
		int[] oldIntArr = {1,2,3};
		
		//for문으로 배열 읽기
		for (int i = 0; i < oldIntArr.length; i++) {
			System.out.print(oldIntArr[i]);
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		//향상된 for문으로 배열 읽기
		for(int i : oldIntArr) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		//배열의 복사
		int[] newIntArr = new int[5];
		for (int i = 0; i < oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
			System.out.print(newIntArr[i] + " ");
		}
		
		System.out.println();

		//newIntArr의 3번 4번(0번부터 시작이므로) 인덱스에는 아무것도없음
		//직접 값 주입
		
		newIntArr[3] = 4;
		newIntArr[4] = 5;
		
		for(int i : newIntArr) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		//System.arraycopy이용하기
		//System.arraycopy(oldIntArr, 0, newIntArr, 0, 0);
		//System.arraycopy(oldIntArr, 시작인덱스, newIntArr, 시작인덱스, 몇개를);
		
		int[] oldIntArr2 = {1,2,3};
		int[] newIntArr2 = new int[5];
		System.arraycopy(oldIntArr2, 0, newIntArr2, 0, oldIntArr2.length);
		for(int i : newIntArr2) {
			System.out.print(i + " ");
			//1 2 3 "0 0" ㅡ> 남은 인덱스는 초기값 저장
		}
		System.out.println();
		System.out.println("-----------------------------------");
		
		
		
	}
}
