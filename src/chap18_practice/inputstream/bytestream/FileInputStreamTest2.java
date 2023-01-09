package chap18_practice.inputstream.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

//read(byte[] b) 메서드
//바이트 배열로 읽어옴

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		//try with resources 사용
		//finally에 close구문을 선언할 필요가 없다.
		try(FileInputStream fis = new FileInputStream("input2.txt");) {
			byte[] bs = new byte [10];
			int i;
			while ((i = fis.read(bs)) != -1) {
//				for (byte b : bs) {
//					System.out.print((char)b);
//				}
				for (int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
		//이럴경우 10개씩 읽어오는데, 만약 자료가 35개면
		//10개씩 4번 읽어올 때, 마지막 배열의 5~10번째 요소는 직전배열의 남아있는 5~10번 요소가 출력됨(가비지)
		//이럴경우 for문 수정을 통해 유효한 값만 얻을 수 있다.
			//i가 읽은 바이트 개수이므로 읽은 바이트 개수보다 작을때만 출력
//			for (int j = 0; j < i; j++) {
//				System.out.println(bs[j]);
//			}
			
		} catch (IOException e) {
			System.out.println(e);
		}

		
		
		
	}

}
