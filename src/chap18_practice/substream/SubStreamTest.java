package chap18_practice.substream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//보조스트림
//실제 읽고 쓰는 스트림이 아닌 보조적인 기능을 추가하는 스트림
//데코레이터 패턴이 적용되었음
//데코레이터 패턴 : 장식자
//FilterInputStream과 FilterOutputStream이 보조스트림의 상위 클래스
//생성자의 매개변수로 또다른 스트림을 가짐

public class SubStreamTest {
	//InputStreamReader와 OutputStreamWriter

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("reader.txt")){
			
			int i = 0;
			while ((i = fis.read()) != -1) {
				//byte로 읽어왔으므로 글자가 다 깨짐
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("======================================================");
		
		//보조스트림인 InputStreamReader를 통해 문자로 변환
		//생정자 안에 다른 스트림(기반 스트림 or 다른 보조스트림)을 넣어서 생성한다.
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i = 0;
			while ((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		try {
			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
