package chap11;

public class WrapperExample {

	public static void main(String[] args) {

		Integer i = 10;
		//생성자를 통한 값 할당은 더이상 지원 안함
		i = new Integer(10);
		//valueOf를 사용하여 값 할당.
		i =Integer.valueOf(50);
		
		//언박싱은 변수.XXvalue 사용
		int num = i.intValue();
		System.out.println(num);
		
		System.out.println((Math.round(123.456*100))/100.0);
	}

}
