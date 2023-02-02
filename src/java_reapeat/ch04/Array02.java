package java_reapeat.ch04;

public class Array02 {

	public static void main(String[] args) {
		//초기화 동시에 값을 할당
		int[] a = new int[] {23, 47, 67, 789, 2};
		//값 출력(for문)
		System.out.println("========<일반 for문>========");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
		
		System.out.println("========<foreach문>========");
		int index = 0;
		for (int i : a) {
			System.out.println("a[" + index++ + "] : " + i);
		}
		
	}

}
