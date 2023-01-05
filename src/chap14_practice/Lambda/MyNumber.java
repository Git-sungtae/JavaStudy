package chap14_practice.Lambda;
//어노테이션을 사용하면 인터페이스 상에서 오류가 남
@FunctionalInterface
public interface MyNumber {
	int getMaxNumber(int num1, int num2);
	//두개를 선언하면 람다를 사용할 수 없음
//	int testNumber();
}
