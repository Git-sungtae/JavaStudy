package chap05;

public class Toy05 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("숫자 2개만 입력하세요");
			System.exit(0);
		}
		
		String value1 = args[0];
		String value2 = args[1];
		
		int num1 = Integer.parseInt(value1);
		int num2 = Integer.parseInt(value2);
		
		System.out.println("합은: "+ (num1 + num2));
				
		
//		
//		
//		
		
		
		

	}

}
