package java_repeat.ch05;

class Person{
	String name;
	int age;
	String gender;
	
	void print() {
		System.out.println("이름:" + name + "\t" + "나이:" + age + "\t" + "성별:" + gender);
	}
}


public class PersonEx {

	public static void main(String[] args) {

		Person per1 = new Person();
		Person per2 = new Person();
		Person per3 = new Person();
		per1.name = "장성태";
		per1.age = 22;
		per1.gender = "M";

		per2.name = "김태산";
		per2.age = 32;
		per2.gender = "M";

		per3.name = "김영광";
		per3.age = 52;
		per3.gender = "Null";
		
		per1.print();
		per2.print();
		per3.print();
		
		
	}

}
