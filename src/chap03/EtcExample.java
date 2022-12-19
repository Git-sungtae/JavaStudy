package chap03;

public class EtcExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.printf("+x: %d%n-x: %d",result1, result2);
		System.out.println();
		
		boolean a = true;
		boolean b = !a;
		boolean c = !!a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int i = 10;
		System.out.println("10의 이진수는: "+Integer.toBinaryString(i));

	}

}
