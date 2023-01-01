package chap05_practice_3;

import java.util.ArrayList;

class Subject{
	
	private String name;
	private int scorePoint;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
}

class Student{
	
	private int studentID;
	private String studentName;
	//수강과목에 대한 배열을 리스트로 관리
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		//생성자에 ArrayList를 추가하여, Stdudent 인스턴스가 만들어질때 마다 리스트를 생성하도록 함
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		//.add메서드를 통해 리스트에 subject 객체 추가
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		//리스트에 있는 객체를 한개씩 가져와서 사용
		for (Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println("학생 " + studentName + "님의 " + subject.getName()+"과목의 성적은 "
					+ subject.getScorePoint() + "점 입니다.");
		}
		System.out.println("학생 " + studentName + "님의 총점은 "+ total + "점 입니다.");
		
	}
	
}




public class ArrayListTest2 {

	public static void main(String[] args) {

		Student studentA = new Student(1001, "A");
		studentA.addSubject("국어", 100);
		studentA.addSubject("수학", 90);
		
		studentA.showStudentInfo();
		System.out.println("=====================================");
		Student studentB = new Student(1002, "B");
		studentB.addSubject("국어", 90);
		studentB.addSubject("수학", 80);
		studentB.addSubject("영어", 70);
		studentB.showStudentInfo();
		
		
		
	}

}
