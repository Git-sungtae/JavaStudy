package chap18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
//Writer(추상클래스) 사용
//FileWriter, BufferedWriter, PrintWriter, OutputStreamWriter
		//write(int c)
		try(Writer wr = new FileWriter("writer.txt")){
			wr.write(65);
			wr.write(66);
			wr.write(67);
			wr.write(10);
			wr.write(10);
		}catch(IOException e) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("===========================");
		
		//write(char[] cbuf)
		try(Writer wr = new FileWriter("writer.txt",true)){
			char[] cBuff = new char[30];
			char temp = 'a';
			for (int i = 0; i < cBuff.length; i++,temp++) {
				cBuff[i] = temp;
			}
			wr.write(cBuff);
			wr.write(10);
			wr.write(10);
		}catch(IOException e) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("===========================");		
		
		//write(char[] cbuf, int off, int len)
		try(Writer wr = new FileWriter("writer.txt",true)){
			char[] cBuff = new char[30];
			char temp = 'a';
			for (int i = 0; i < cBuff.length; i++,temp++) {
				cBuff[i] = temp;
			}
			wr.write(cBuff,5,2);
			wr.write(10);
			wr.write(10);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		//write(String str), write(String str, int off, int len)
		try(Writer wr = new FileWriter("writer.txt",true)){
			String temp = "스트링으로 그냥 입력하기";
			wr.write(temp);
			wr.write(10);
			wr.write(10);
			wr.write(temp, 1, 4);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}//메인

}
