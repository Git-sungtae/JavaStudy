package chap11_practice_2;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str1 == str3);
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str3 == str4);
		
		String str5 = new String();
		str5 = "abc";
		
		System.out.println(str1 == str5);
		System.out.println(str3 == str5);
		
	}

}
