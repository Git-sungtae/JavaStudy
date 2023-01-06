package chap14_practice.Lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		StringConcat concat = (s1, s2) -> {
			System.out.println(s1+","+s2);
		};
		
		concat.makeString("hello", "java");
	}

}
