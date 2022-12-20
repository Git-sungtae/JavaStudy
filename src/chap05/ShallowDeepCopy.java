package chap05;

public class ShallowDeepCopy {

	public static void main(String[] args) {

//		얕은 복사(Shallow Copy) : 169p
		String[] old = {"1", "2", "3"};
		String[] newArray = new String[5];

		newArray  = old;
		
		for(String num : newArray) System.out.print(num+", ");
			System.out.println();
			System.out.println();	
		
			old[0] = "100";
//		값을 변경했음
			
		for(String num : newArray) System.out.print(num+", ");
			System.out.println();
			System.out.println();	
//		newArray가 old[0]의 값을 참조 : 얕은 복사
//		!연산자는 얕은 복사를 실행한다.
			
		for(String num : old) System.out.print(num+", "); 

	}

}
