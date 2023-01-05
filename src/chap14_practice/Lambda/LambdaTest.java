package chap14_practice.Lambda;
//함수형 프로그래밍
//람다를 변수처럼 사용
interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		//변수에(str) 대입해서 impl하는 방법
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
		
	}
	//impl이 된 변수자체를 매개변수로 넘기는 방법
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	//impl한 객체 자체를(PrintString타입의 객체) 리턴값으로 넘기는 방법
	public static PrintString returnPrint() {
		return s -> System.out.println(s + "world");
	}

}
