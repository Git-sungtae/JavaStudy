package java_reapeat.ch10;

public class Exception5 {
	
	static void method(boolean b) {
		
		try {
			System.out.println(1 + "b-->" + b);
			if (b) {
				throw new ArithmeticException();
			}
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println("RuntimeException" +  "-->" + 3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println("예외발생여부에 관계없이 항상 실행되는 문장" + 5);
		}
		
		System.out.println("정상적으로 끝나야 실행되는 문장");
		
	}

	public static void main(String[] args) {

		method(true);
		method(false);
		
	}

}
