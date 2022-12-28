package chap10_practice_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("a.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		} finally {
//			//입출력 스트림을 호출하면 무조건 닫아야함
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// 입출력은 닫을때 IOE 예외가 발생할수있으므로
//				// 또 try catch문으로 감싸야함
//				// 코드가 복잡해짐 → try-with-resourses 구문 사용
//				e.printStackTrace();
//			}
//			System.out.println("finally");
//		}
//		System.out.println("end");
		
		//try-with-resources 구문 사용
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		 
	
	}
}
