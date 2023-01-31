package java_repeat.ch07;

public class PersonEx {

	public static void main(String[] args) {
		// 부모 rv = new 자식(); up casting OK
		// 부모 method()와 자식 method() 이름을 같을 때는  자식 메소드 실행
		// 부모의 멤버변수와 자식의 멤버변수가 이름이  같을 때는 부모 멤버변수 실행
		
		//자식 rv2 = new 부모(); down casting X
		//자식 rv3 = (자식)부모객체;  down casting O
		// 강제 형변환 하면 
		//1) 문법적 에러가 없음 
		//2) 에러가 있을 때도 없을 때도 있다
		
		Person[] ps = new Person[5];
		ps[0] = new Student("옥주현", 23, "1203667");
		ps[1] = new Student("김유신", 53, "1386889");
		
		ps[2] = new Teacher("대조영", 48, "Java");
		
		ps[3] = new Manager("조정은", 28, "뮤지컬");
		ps[4] = new Manager("김준수", 40, "MC");
		
		for (Person person : ps) {
			person.print();
			if (person instanceof Teacher) {
				Teacher tc = (Teacher) person;
				System.out.println("과목 : " + tc.getSubject());
			} else if (person instanceof Manager) {
				Manager mg = (Manager) person;
				System.out.println("담당 : " + mg.getPart());
			}
		}
		
		
	}

}
