package chap18_practice.substream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//데이터 자료형을 그대로 읽고 쓰는 스트림


public class DataInOutStreamTest {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.write(100);
			dos.writeInt(10);
			dos.writeChar('A');
			dos.writeUTF("Hello");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	
	
		try(FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			System.out.println(e);
		}

	}
}