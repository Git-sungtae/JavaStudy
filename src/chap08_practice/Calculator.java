package chap08_practice;

public abstract class Calculator implements Calc{
//인터페이스를 다 구현하지않을 경우 추상클래스로 변경하여야 한다.
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
