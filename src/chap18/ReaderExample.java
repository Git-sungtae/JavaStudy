package chap18;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReaderExample {

	public static void main(String[] args) {

//Reader(추상클래스) 사용
//FileReader, BufferedReader, InputStreamReader
//read()
		
		try(Reader rd = new FileReader("reader.txt")){
			int len;
			while((len = rd.read())!= -1) {
				System.out.print((char)len);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("=============================");
		
//read(char[] cbuff)
		
		try(Reader rd = new FileReader("reader.txt")){
			char[] cBuff = new char[6]; 
			int len;
			while((len = rd.read(cBuff))!= -1) {
				String temp = new String(cBuff,0,len);
				System.out.println(temp);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("=============================");
//read(char[] cbuf, int off, int len)
		try(Reader rd = new FileReader("reader.txt")){
			char[] cBuff = new char[6]; 
			int len;
			while((len = rd.read(cBuff,2,2))!= -1) {
				String temp = new String(cBuff);
				System.out.println(temp + "/");
				Arrays.fill(cBuff, ' ');
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		
		
	}//메인

}
