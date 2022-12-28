package chap10_practice_1;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try(obj) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception");
		}
		//콘솔창) 정상실행돼도, 예외발생이 돼도 두 경우 다 Autoclose됨
	}

}
