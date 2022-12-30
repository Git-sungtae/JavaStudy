package chap11;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
		char[] arr1 = {'J',	'A', 'V','A',};
		for (char c : arr1) {
			System.out.print(c+ " ");
		}
		System.out.println("\n==========================");
		//arr2로 복사 1
		char[] arr2 = new char[8];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n==========================");
		//arr2로 복사 2 Arrays.copyOf
		 arr2 = Arrays.copyOfRange(arr1, 0, arr1.length);
		 System.out.print(arr2);
		 System.out.println("\n==========================");
		//arr2로 복사 3 System.arrayCopy
		 System.arraycopy(arr1, 0, arr2, 0, 0);
		 System.out.println(Arrays.toString(arr2));
		 
	}

}
