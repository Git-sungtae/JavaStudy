package chap18_practice.inputstream.bytestream;

import java.io.FileInputStream;
import java.io.IOException;
//read() 메서드

public class FileInputStreamTest {

	public static void main(String[] args) {

		FileInputStream fis = null;
		int i = 0;
		try {
			fis = new FileInputStream("input.txt");
		
		//read() : 한 바이트씩 읽음
		//3회 읽기
//		System.out.print((char)fis.read());
//		System.out.print((char)fis.read());
//		System.out.print((char)fis.read());
			while(fis.read() != -1) {
				System.out.print((char)fis.read());
			}
		//file에 한글이 있으면 깨져서 나옴
		//read가 바이트단위로 읽기 때문에 2byte인 한글은 깨져서 나옴
		//이런 이유떄문에 file은 FileReader를 사용하여야한다.
		//FileReader를 사용하게되면 문자를 인코딩된 대로 읽어온다.
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}		
		//file 끝까지읽기 → while 사용
		//read()는 끝까지 도달하면 -1을 리턴함을 이용한다.
//		while(fis.read() != -1) {
//			System.out.println((char)fis.read());
//		}
	

