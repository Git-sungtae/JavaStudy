package chap18_practice.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

//RandomAcceccFile 클래스
//입출력 클래스 중 유일하게 파일 입출력을 동시에 할 수 있는 클래스
//파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함
//다양한 자료형에 대한 메서드가 제공됨
public class RandomAcceccFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		rf.writeInt(100); //4byte
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println(rf.getFilePointer());//8byte (+4byte)
		rf.writeUTF("안녕하세요");//한글 1개당 3byte, 끝에 null 2byte =17
		System.out.println(rf.getFilePointer());//29
		
		//파일 포인터 처음으로 이동
		rf.seek(0);
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
