package java_reapeat.ch04;

public class Array03 {

	public static void main(String[] args) {

		String[] strArr = {"코로나", "물가", "손흥민", "국민연금", "우영우"};
		
		System.out.println("========<일반 for문>========");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr[" + i + "] : " + strArr[i]);
		}
		
		System.out.println("========<foreach문>========");
		int index = 0;
		for (String string : strArr) {
			System.out.println("strArr[" + index++ + "] : " + string);
		}
		
	}

}
