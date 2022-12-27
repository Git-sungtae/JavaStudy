package chap08_practice_1;

public abstract class Calculator implements Calc{
//인터페이스가 요구하는 기능을 다 구현하지않을 경우 추상클래스로 변경하여야 한다.
	
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}



}
