package java_reapeat.ch07;

public class Student extends Person{
	
	private String sno;

	Student(String name, int age, String sno) {
		super(name, age);
		this.sno = sno;
	}
	
	public void print() {
		super.print();
		System.out.println("학번 : " + sno);
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

}

class Teacher extends Person{
	
	private String subject;

	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}

class Manager extends Person{
	private String part;
	
	Manager(String name, int age, String part) {
		super(name, age);
		this.part = part;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	
	
}
