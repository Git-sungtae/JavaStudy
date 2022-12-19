package chap04;

public class SwitchExample {
//swich문의 case를 if else문처럼 범위로 묶어서 사용하는 방법
	public static void main(String[] args) {
//		int age = 71;
		int age = (int)(Math.random()*100)+1;
		switch ((int)age/10) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("연금수령이 가능한 나이입니다.");
			break;

		default:
			System.out.println("연급수령이 불가능한 나이입니다.");
			break;
		}
	}

}
