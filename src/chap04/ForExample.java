package chap04;

import java.util.Iterator;

public class ForExample {

	public static void main(String[] args) {
		//for문으로 짝수 출력해보기
//		for (int i = 1; i <= 100; i++) {
//			if ((i%2)==0) {
//				System.out.print(i);
//			}
//		}
		
		//for문으로 짝수의 합만 구해보기
//		int sum = 0;
//		
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum = sum + i;
//			}
//		}
//		
//		System.out.println(sum);
		
		//for문으로 구구단 만들기
		
//		for (int i = 2; i <= 9; i++) {
//			System.out.println(i + "단입니다");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " X " + j+ " = "+(i*j));
//			}
//			System.out.println();
//
//		}

		//for로 점찎어보기
		
		for (int i=0; i<5; i++) {
			for (int j=4; j>=0; j--) {
				if (j>i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
	
		
		
	}//메인

}//클래스
