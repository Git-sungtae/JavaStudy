package chap18_practice.others;

import java.util.Scanner;

//Scanner
//java.util에 있는 입력 클래스
//문자 뿐아니라 정수, 실수 등 다른 자료형동 읽을 수 있다.
//자료를 읽을 수 있는 대상도 다양함(콘솔,파일) 
//system.in보다 많이씀
//system.in은 바이트단위로 읽어오기 때문에 다양한 자료형을 쓰려면 보조스트림을 사용해야함

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//nextLine() : 한 줄을읽음(newline까지 읽는다)
		String name = scanner.nextLine();
		//nextInt() : 입력값을 Int로 읽어옴
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(num);
	}

}

