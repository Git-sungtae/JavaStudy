package chap10_practice_1;
//custom Exception을 통해 ID형성조건을 만들어보자
//ID값이 null이거나 8ㅈ이하, 20자이상인 경우 예외가 발생
public class IDFormatException extends Exception{
	public IDFormatException(String messege) {
		super(messege);
	}
}
