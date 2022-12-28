package chap10_practice_1;
//autoCloseable 클래스 만들어보기
public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("close");		
	}
	
	
}
