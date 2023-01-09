package chap18_practice.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {

//		System.out.println("알파벳 한개를 쓰고 엔터를 누르세요");
//		int i=0;
//		//모든 스트림은 예외처리를 해야함에 주의
//		try {
//			i = System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(i);
		
		
		System.out.println("============================");
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
		int j=0;
		//여러개를 읽어올경우 → while문 사용
		try {
			//입력값이 \n이 아닌동안 계속 값을 읽음
			while ((j = System.in.read()) != '\n') {
				System.out.print((char)j);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
