package chap18_practice.outputstream.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//fileoutputstream  사용
//Outputstream은 바이트단위 최상위 스트림
//fileoutputstream, bytearrayoutputstream, filteroutputstream이 하위클래스로 존재
//flush() 메서드 : 입/출력은 바로 기능하지않고, 입/출력용 버퍼(시스템 내부)가 치고 비워지면서 입/출력이 작동
//flush는 버퍼를 강제로 비워내어 자료를 출력하게 만듬
//close() 메서드 : 출력스트림과 연결된 대상 리소스를 닫음. 이때, flush()도 호출됨.
//따라서 close()를 사용하면 모든 리소스가 writing이 된다.
public class FileOutputStreamTest {

	public static void main(String[] args) {
		//input과 달리 output은 writing을 할때 파일이 없으면 파일을 생성해준다.
		//file의 위치는 프로젝트에 생성됨(refresh 하면 나타남)
		//계속 실행하면 계속 덮어써짐(overwirte 됨)
		//overwrite말고 추가하는 append를 하고싶으면 ("output.txt",true)로 변경
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(254);
			fos.write(255);
			fos.write(256);
			fos.write(257);
		} catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
		
		//배열 일부만 가져오기
		//write(byte[] b, 시작 인덱스, 출력개수)
		byte[] bs = new byte[26];
		byte data = 65;
		for (int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
		try(FileOutputStream fos2 = new FileOutputStream("output2.txt")){
			//2번 인덱스부터 10개만 입력
			fos2.write(bs, 2, 10);
		} catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end2");

		
		
	}

}
