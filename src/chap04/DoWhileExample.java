package chap04;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("종료하려면 q를 누르세요");
		String inputString;
		
		
		do {
			Scanner scanner = new Scanner(System.in);
			inputString = scanner.nextLine();
			System.out.println(inputString);
			
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");

	}

}
