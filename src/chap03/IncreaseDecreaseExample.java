package chap03;

public class IncreaseDecreaseExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
//		System.out.println(++x);
//		System.out.println(x++);
//		System.out.println(x);

		z = ++x + 10;
		System.out.println(z);

		System.out.println(x);
		System.out.println();
		
		z = x++ + 10;
		System.out.println(z);
		System.out.println(x);
		System.out.println();
		

	}

}
