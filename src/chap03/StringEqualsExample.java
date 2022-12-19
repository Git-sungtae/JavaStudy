package chap03;

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "신민철";
		String str2 = "신민철";
		String str3 = new String("신민철");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
	} 

}
