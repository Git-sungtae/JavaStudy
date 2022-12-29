package chap11;

public class EqualsApi {
	int num;
	public EqualsApi(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		String s1= new String();
		s1= "a";
		
		String s2 = new String();
		s2= "a";
		
		String s3 = new String("a");

//		int[] arr1=null;
		
		
		int[] arr2 = new int[] {1,2};
		int[] arr3 = new int[2];
		arr3[0] = 1;
		arr3[0] = 2;
		System.out.println(arr2.hashCode());
		System.out.println(arr3.hashCode());
		
		
//		System.out.println(obj1.equals(obj2));
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//		s1.isEmpty();
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);

	}

}
