package chap11;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		//arrays.sort(*[])
		int[] arr = {3,1,7,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 3));
		
		
		String[] stArr = {"다태", "나성", "가장"};
		Arrays.sort(stArr);
		System.out.println(Arrays.toString(stArr));
		
		//binarySearch
		Arrays.binarySearch(stArr, "가장");
		System.out.println(Arrays.binarySearch(stArr, "가장"));
		
	}

}
