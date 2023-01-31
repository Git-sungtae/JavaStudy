package java_repeat.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception2 {

	public static void main(String[] args) {
		
		int kkk = 0;
		float fVar = 22.31f;
		String kStr = "문자열";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int num1;
			try {
				System.out.println();
				System.out.print("첫 번째 값을 입력하세요 => ");
				num1 = Integer.parseInt(in.readLine());
				System.out.print("두 번째 값을 입력하세요 => ");
				int num2 = Integer.parseInt(in.readLine());
				System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			} catch (Exception e) {
				System.err.print(e.getMessage());
			}
			
			
		}

	}

}
