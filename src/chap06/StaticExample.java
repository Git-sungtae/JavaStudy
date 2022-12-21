package chap06;


class Person2{
	//필드
	//static 필드
		static String nation ;
		static String ssn;
		static String info;
		String name;
		
		static double PI = 3.14;
		static double EARTH_RADIUS = 6400;  
		
		//생성자
		//static 변수는 생성자 안에서 초기화 될 수 없다.
		//생성자는 객체 생성시에만 실행되기 때문
		
//		Person(String ssn, String name){
//			this.ssn = ssn; ㅡ> static 필드이므로 컴파일 에러
//			this.name = name; ㅡ> 인스턴스 필드이므로 문제없음
//		}

		//static필드를 초기화해주는 static 블록
		//static블록은 초기화만 담당한다 = 선언은 블록 밖에서 해야함
		//static블록은 메모리에 클래스가 올라가는 동시에 실행됨
		static {
			nation = "국적";
			ssn = "신분확인번호";
			info = nation + " / " + ssn;
			
			//static 블록 내부에서는 인스턴스필드나 메소드를 사용할 수 없다.
			//name은 인스턴스 필드이므로 에러 발생
//			info = nation + " / " + name;
			
			//객체자신 참조인 this도 불가능
//			this.nation = nation;
			
		}
		
		
}



public class StaticExample {

	public static void main(String[] args) {

		//static 블록에서 초기화되었는지 확인
		System.out.println(Person2.nation);
		System.out.println(Person2.ssn);
		System.out.println(Person2.info);
		
		System.out.println("--------------------");
		
		//인스턴스의 스태틱 필드 값을 변경해도
		//클래스의 스태틱 필드 값이 변경된다. 
		System.out.println(Person2.nation);
		
		Person2 person = new Person2();
		person.nation = "이중국적";
		//인스턴스 변수를 통한 스태틱필드 접근을 자바는 권장하지 않는다.
		
		System.out.println(Person2.nation);
		
	}

}
