package java_reapeat.ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 76,45,34,89,100,50,90,92 8개의 값을 1차원 배열로 초기화 하고 값에 
		// 합계와 평균	그리고 최대값과 최소값을 구하는 프로그램을 작성
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 0;
		
		int[] array = {76, 45, 34, 89, 100, 50, 50, 92};
		
		sum = Arrays.stream(array).sum();
		avg = Arrays.stream(array).average().getAsDouble();
		max = Arrays.stream(array).max().getAsInt();
		min = Arrays.stream(array).min().getAsInt();
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
