package chap10_practice_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c= Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		//메소드를 호출하는 쪽에서 예외를 처리하도록
		//예외를 넘기는 throws
		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}  catch (Exception e) {
			//어떤오류일지 모를때 Exception으로 처리하면된다.
			//대신, 가장 밑에서 써야함
			//위에다가 쓰면 밑에있는 catch블록은 unreachable error
			System.out.println(e);
		}
		System.out.println("end");

	}

}
