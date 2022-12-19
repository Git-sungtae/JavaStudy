package chap04;

public class IfExample {

	public static void main(String[] args) {
		int age = 31;
		
		if (age >= 65) {
			System.out.println("노년입니다");
		} else if(age > 55){
			System.out.println("장년입니다");
		} else if(age >= 35) {
			System.out.println("중년입니다");
		} else if(age >= 25) {
			System.out.println("청년입니다");
		} else if(age >= 25){
			System.out.println("청소년입니다");
		} else {
			System.out.println("어린입니다");
		}
		
//		if (0 <= age < 100) {
//			System.out.println("사람입니다");
//		}
//		연산방향이 >> 이므로 0과 age가 비교된 후 나온 true값과 100이 비교되는
//		연산이 되어버리기때문에 boolean과 100을 비교할 수 없기떄문에 에러발생
			
//		if (age>=0 || age <100) {
//			System.out.println("사람입니다");
//		}
		
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
