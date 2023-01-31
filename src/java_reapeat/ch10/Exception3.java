package java_reapeat.ch10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception3 {

	public static void main(String[] args) {

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
			} catch (NumberFormatException e) {
				System.out.println("숫자 쓰라고");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나누지마라");
			} catch (Exception e) {
				System.out.println("전체 오류");
			}
		
		}
	}
}
