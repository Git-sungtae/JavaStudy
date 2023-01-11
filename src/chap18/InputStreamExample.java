package chap18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class InputStreamExample {

	public static void main(String[] args) {
	//InputStream(추상클래스) 사용
	//FileInputStream, BufferedInputStream, DataInputStream
	//read()
		try(InputStream is = new FileInputStream("input.txt")){
			int len;
			while((len = is.read()) != -1) {
				System.out.print((char)len);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("=============================");
	//read(byte[] b)
		try(InputStream is = new FileInputStream("input.txt")){
			byte[] ibuff = new byte[10];
			int len;
			while((len = is.read(ibuff)) != -1) {
//				for (byte b : ibuff) {
//					System.out.print((char)b);
//				}
//				String temp = new String(ibuff);
//				System.out.print(temp + "/");
////				ibuff = new byte[10];
//				Arrays.fill(ibuff, (byte)0);
				String temp = new String(ibuff, 0, len);
				System.out.println(temp + "/");
				
			}
		}catch(IOException e) {
			
		}
		System.out.println();
		System.out.println("=============================");
	//read(byte[] b, int off, int len)
		try(InputStream is = new FileInputStream("input.txt")){
			byte[] ibuff = new byte[10];
			int len;
			while((len = is.read(ibuff,2,8)) != -1) {
				String temp = new String(ibuff);
				System.out.print(temp + "/");
				Arrays.fill(ibuff, (byte)0);
			}
		}catch(IOException e) {
			
		}
	}//메인
	
}
