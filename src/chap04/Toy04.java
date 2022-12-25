package chap04;

public class Toy04 {

	public static void main(String[] args) {
		
//		int age = 72;
//		
//		if (age >= 65) {
//			System.out.println("노년입니다");
//				if (age>=73) {
//					System.out.println("연금수령이 가능한 나이입니다.");
//				} else {
//					System.out.println("연금수령이 불가능한 나이입니다.");
//				}
//		} else if(age > 55){                
//			System.out.println("장년입니다");
//		} else if(age >= 35) {
//			System.out.println("중년입니다");
//		} else if(age >= 25) {
//			System.out.println("청년입니다");
//		} else if(age >= 25){
//			System.out.println("청소년입니다");
//		} else {
//			System.out.println("어린입니다");
//		}
		
int time = 9;
System.out.println("현재시간은 " + time +"시 입니다.");
switch (time) {
	case 8:
		System.out.println("8번 종을 치세요.");
		break;
	case 9:
		System.out.println("9번 종을 치세요.");
//		break;
	case 10:
		System.out.println("10번 종을 치세요.");
//		break;

	default:
		System.out.println("시계가 고장났습니다.");
//		break;
}
		
		
		
	}//메인
}//클래스


