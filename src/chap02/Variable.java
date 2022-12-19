package chap02;

public class Variable {
	static int z=10;
	public static void main(String[] args) {
	//변수 선언
	int x;	
	int y;
	double value;
	
	// double 3value;
	// 변수이름은 숫자로 시작할 수 없음
	// double #value;
	// $, _ 이외의 특수문자로 시작 불가능
	
	double Value;	//변수이름은 대문자로 시작할 수 있으나 소문자가 관례이다
	
	String firstName;
	String firstname; // 관례적으로 사용하지 않음
	
	//변수의 선언과 초기화
	int time;
	time = 0;
	
	//이스케이프 문자 사용
	
	System.out.println("이스케이프로 줄바꾸기가\n가능할까");
	System.out.println("이스케이프로 수평띠우기가\t가능할까");
	
	//변수의 사용
	System.out.println(z);
	}
}
