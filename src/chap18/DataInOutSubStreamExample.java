package chap18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutSubStreamExample {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.write(65);
			dos.writeBoolean(false);
			dos.writeDouble(3.14);
			//순서가 같아야함 아니면, EOFException
//			dos.writeChars("찰스");
			dos.writeUTF("인코딩UTF");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.read());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		
	}

}
