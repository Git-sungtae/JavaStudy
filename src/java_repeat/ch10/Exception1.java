package java_repeat.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1 {

	public static void main(String[] args) throws IOException {

		int kkk = 0;
		float fVar = 22.31f;
		String kStr = "문자열";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println();
			System.out.print("첫 번째 값을 입력하세요 => ");
			int num1 = Integer.parseInt(in.readLine());
			System.out.print("두 번째 값을 입력하세요 => ");
			int num2 = Integer.parseInt(in.readLine());
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			System.out.printf("1.printf --> %d / %d = %d", num1, num2, num1/num2);
			System.out.println();
			System.out.printf("2.printf --> 문자 : %s 소수점 : %f", kStr, fVar);
			
		}
		
		
	}

}
