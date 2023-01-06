package chap14_practice.Lambda;

class NotAno implements MyNumber{

	@Override
	public int getMaxNumber(int num1, int num2) {
		int result = (num1>=num2)? num1 : num2;
		return result;
	}
}

public class MyNumber_Test {

	public static void main(String[] args) {
		//MyNumber 인터페이스 구현을 바로 람다로 함
		MyNumber maxNum = (x,y) -> (x>=y)? x : y;
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		
 
		//람다식이 내부적으로 구현되는 과정 
		MyNumber aaa = new MyNumber() {
			//인터페이스의 익명구현객체의 메서드를 선언하는것
			@Override
			public int getMaxNumber(int num1, int num2) {
				int result = (num1>=num2)? num1 : num2;
				return result;
			}
		};
		
		int inMax = aaa.getMaxNumber(10, 20);
		System.out.println(inMax);
	}

}
