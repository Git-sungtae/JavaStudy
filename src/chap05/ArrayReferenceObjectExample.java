package chap05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		//객체를 참조하는 배열
		
		String[] strArr = new String[3];
		strArr[0] = "Java";
		strArr[1] = "Java";
		//배열 안에 "문자열"을 넣은것
		strArr[2] = new String("Java");
		//배열 안에 "객체"를 넣은것
		
		System.out.println("stArr : " + System.identityHashCode(strArr[0]));
		System.out.println("stArr1: " + System.identityHashCode(strArr[1]));
		System.out.println("stArr2: " + System.identityHashCode(strArr[2]));
		
		//Arr 과 Arr1은 문자열(같음), 주소(같음)
		//Arr2는 문자열(같음) 주소(다름)
		//==를 사용할 경우, Arr==Arr1=/=Arr2(==는 저장값만 비교(주소))
		//equals는 실제값을 비교, Arr=Arr1=Arr2
		
		
	}
}
