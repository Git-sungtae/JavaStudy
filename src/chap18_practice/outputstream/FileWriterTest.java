package chap18_practice.outputstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		//문자열(한글,영어 구분 없이), 문자, 숫자 문자배열가능(String배열 안됨) 
		try(FileWriter fw = new FileWriter("writer.txt")){
			String[] sbuf = {"가", "나", "다", "라"};
			fw.write('A');
			char[] cbuf = {'B', 'C', 'D'};
			fw.write(cbuf);
			fw.write("안녕하세요");
			fw.write("123");
			fw.write(cbuf, 1 , 2);
			
			}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end!");
	}

}
