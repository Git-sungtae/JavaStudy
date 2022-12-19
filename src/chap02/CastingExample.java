package chap02;

public class CastingExample {

	public static void main(String[] args) {

		int intValue = 103029770;
//		byte byteValue = intValue;
//		파일타입 E! 파일타입 에러
		byte byteValue = (byte)intValue;
//		강제형변환 : (형변환 할 데이터타입)변수
		System.out.println(intValue);
		System.out.println(byteValue);
		System.out.println();
		
		double doubleValue = 3.14;
		int intValue2 = (int) doubleValue;
		System.out.println(intValue2);
		System.out.println();
	}

}
