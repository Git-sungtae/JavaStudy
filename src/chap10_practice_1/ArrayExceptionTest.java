package chap10_practice_1;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		try {//이 안에서 예외가 발생하고,
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
				//선언한 예외라면, catch안을 실행해라.
		} catch(ArrayIndexOutOfBoundsException e) {
			//이곳에 오류에 관한 log를 남길 코드를 작성.
			System.out.println(e);
			return;
		} finally {
			//catch문에 return으로 인해 메서드를 종료시키더라도, finally는 실행됨
			System.out.println("무조건 실행");
		}
		
		System.out.println("end");
	}

}
