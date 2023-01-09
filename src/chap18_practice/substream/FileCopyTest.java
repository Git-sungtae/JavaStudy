
package chap18_practice.substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//버퍼링 기능
public class FileCopyTest {

	public static void main(String[] args) {
		//a.exe파일을 b.exe파일에 복사
		//한바이트씩 읽어서 복사하기
		
		//시간체크
		long milliseconds = 0;
		int len = 0;
		
		try(FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("b.txt");
			//8K정도의 버퍼를 가지고있음
			//1byte씩 읽어오는 스트림보다 8000배 빠르게 가능함
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)
			){
			milliseconds = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
				len++;
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
		} catch(IOException e){
			System.out.println(e);
		}
		
		System.out.println(len);
		System.out.println(milliseconds);
		
				
		
	}

}
