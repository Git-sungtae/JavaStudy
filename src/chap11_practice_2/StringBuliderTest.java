package chap11_practice_2;

public class StringBuliderTest {

	public static void main(String[] args) {
		
		String str1 = new String("장성태");
		
		System.out.println("최초 메모리 주소: " + System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1); 
		System.out.println("빌더 생성 후 메모리 주소: " + System.identityHashCode(buffer));
		
		buffer.append("태");
		buffer.append("태");
		System.out.println("append 후 메모리 주소: " + System.identityHashCode(buffer));
		
		String str2 = buffer.toString();
		System.out.println(str2);

	}

}
