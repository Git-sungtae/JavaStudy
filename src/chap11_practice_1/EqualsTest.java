package chap11_practice_1;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentId = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;//downcasting
			if (studentId == std.studentId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	//equals가 재정의 됐으니, hash도 같은값을 리턴하도록 재정의
	@Override
	public int hashCode() {
		return studentId;
	}
	
}




public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		
		//==연산자에 의한 비교 : 둘은 같은 주소인가? → 물리적 동등
		System.out.println(str1 == str2);
		//equals에 의한 비교 : 둘은 같은 값을 가지는가? → 논리적 동등
		//object에 있는 equals는 ==연산자와 일치한다.
		//클래스마다 equals를 논리적 동등을 비교하기위한 방식으로 재정의 하였다. 
		System.out.println(str1.equals(str2));
		System.out.println("============================");
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		System.out.println("============================");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println("============================");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//논리적 동등을 비교하기위해 equals를 사용하는경우,
		//hashCode()메서드도 재정의하여, 논리적으로 동등한 객체는
		//같은 hashCode를 반환하도록 재정의 해야한다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
