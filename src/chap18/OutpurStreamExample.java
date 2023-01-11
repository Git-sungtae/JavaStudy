package chap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutpurStreamExample {

	public static void main(String[] args) {
//OutputStream(추상클래스) 사용
//FileOutputStream, PrintOutputStream, DataOutputStream
	//write()
		try(OutputStream os = new FileOutputStream("output.txt")){
			//1바이트씩만 적기때문에, 아스키코드 이용하여 원하는 문자열 작성
			os.write(65);
			os.write(66);
			os.write(67);
			os.write(10);
			os.write(10);

		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("============================================");
		
	//write(byte[] b)
		//덮어쓰기:false(기본값), 이어쓰기:true
		try(OutputStream os = new FileOutputStream("output.txt",true);
				InputStream is = new FileInputStream("input.txt")){
			//getbytes를 사용하면 byte[]를 리턴함
			os.write("ABC".getBytes());
			os.write("가나다".getBytes());
			os.write("\n".getBytes());
			os.write("\n".getBytes());
			//read로 읽어온것 write로 옮기기
			byte[] buff = new byte[5];
			int length;
			while((length = is.read(buff)) != -1) {
				os.write(buff);
			}
			os.write("\n".getBytes());
			os.write("\n".getBytes());
		}catch(IOException e) {
			System.out.println(e);
		}
		
	//write(byte[] b, int off, int len)
		try(OutputStream os = new FileOutputStream("output.txt",true);
				InputStream is = new FileInputStream("input.txt")){
			//getbytes를 사용하면 byte[]를 리턴함
			//BC와 나다 만 가져오기
			os.write("ABC".getBytes(),1,2);
			os.write("\n".getBytes());
			//한글은 짤려서 나옴
			os.write("가나다".getBytes(),1,2);
			os.write("\n".getBytes());
			os.write("\n".getBytes());
			//read로 읽어온것 write로 옮기기
			byte[] ibuff = new byte[3];
			int length;
			while((length = is.read(ibuff)) != -1) {
				os.write(ibuff,1,2);
			}
		}catch(IOException e) {
			System.out.println(e);
		}		
		
	}//메인
}
