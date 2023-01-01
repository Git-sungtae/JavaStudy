package chap11_practice_2;

class Person{
	
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException{

		Person person = new Person();
		//getClass : Object의 메서드 → 현재 참조하는 객체의 클래스를 가져올수있음
		//xxx.class : 현재 참조하는 객체의 클래스를 가져올수있음
		//두 방법은 생성된 인스턴스가 있어야 가능하다.
		Class pClass = person.getClass();
		System.out.println(pClass.getName());
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		//Class.forName("패키지명.클래스명") → 생성된 인스턴스가 없어도 사용가능
		//메모리에 올라갈 때(실행될 때), 문자열과 일치하는 클래스를 리턴함 → 동적 로딩
		Class pClass3 = Class.forName("chap11_practice_2.Person");
		System.out.println(pClass3.getName());

		
	}

}
