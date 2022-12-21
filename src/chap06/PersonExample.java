package chap06;


class Person{
	//필드
	//final 필드
	final String nation = "Korea";
	final String ssn;
	String name;
	
	static final double PI = 3.14;
	static final double EARTH_RADIUS = 6400;  
	
	//생성자
	
	Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}

}

public class PersonExample {

	public static void main(String[] args) {

		Person person1 = new Person("123456-1234567", "영광");
		
		System.out.println(person1.nation);
		System.out.println(person1.ssn);
		System.out.println(person1.name);
		
		person1.name = "태산";
//		person1.ssn = "666666-6666666";
		//ssn이 파이널 필드이기 때문에 값을 변경할 수 없음
		System.out.println("---------------------------------");
		
		//상수(final + static)
		//static이기 때문에 생성자 없이 호출 가능
		System.out.println(Person.EARTH_RADIUS);
		System.out.println(Person.PI);
		
		//Person.PI = Person.EARTH_RADIUS;
		//final이기 때문에 값 변경 불가능
		
		
		
		
	}

}
