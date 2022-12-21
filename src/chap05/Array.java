package chap05;

public class Array {

	public static void main(String[] args) {

		//배열 만들기
	int[] arr = {1,2,3};
	int[] arr2 = new int[] {1,2,3};
	int[] arr3 = new int[5];
	
		//배열복사
	//배열의 복사는 for문이나
	//System.arraycopy(old,시작인덱스,new,시작인덱스,어느길이만큼)를 사용
	System.arraycopy(arr2, 0, arr3, 0, arr2.length);
	for (int i = 0; i < arr2.length; i++) {
		arr3[i] = arr2[i];
	}
	
	//향상된 for문으로 배열의 모든 값을 가져올 수 있다.
	//for (타입 담을변수 : 대상배열){ ... }
	for (int a : arr3) {
		System.out.println(a);
	}

		
	}

}
