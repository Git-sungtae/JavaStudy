package chap11_practice_2;

public class StringTest2 {

	public static void main(String[] args) {

		String str1 = new String("장");
		String str2 = new String("성태");
		
		System.out.println("연결 전 주소 : " + System.identityHashCode(str1));
		
		str1 = str1.concat(str2); // concat : 연결해주는 메서드
		System.out.println(str1);
		
		System.out.println("연결 후 주소 : " + System.identityHashCode(str1));
		
	}

}
