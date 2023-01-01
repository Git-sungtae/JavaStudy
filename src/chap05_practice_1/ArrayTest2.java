package chap05_practice_1;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
		
		double total = 1;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			total *= num[i];
		}
		//3~4번 인덱스까지는 값이 할당안되어, 초기화값인 0.0이 들어가있음.                                                               
		System.out.println("total: " + total);// 0.0"
		//이렇게 값이 할당된 부분(유효한 배열)만 사용하고자 할경우는
		//.length를 반복하지말고, 변수하나를 선언해서 value++을 하여 사용함
		System.out.println("==============================");
		double[] num2 = new double[5];
		int size = 0;//실제 입력된 데이터를 계산하기 위한 변수를 선언
		num2[0] = 10.0; size ++;//입력될때 마다 size 증가
		num2[1] = 20.0; size ++;
		num2[2] = 30.0; size ++;
		
		System.out.println("===============================");
		double total2 = 1;
		for (int i = 0; i < size; i++) {
			System.out.println(num2[i]);
			total2 *= num2[i];
		}
		System.out.println("total: " + total2);
		
	}

}
