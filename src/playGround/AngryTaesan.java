package playGround;

import java.util.Scanner;

public class AngryTaesan {
	String angerGrade;
	int taesanAnger;
	String day;
	
	public void dailyTaesan() {
		System.out.println(this.day + "요일 태산씨의 기분을 알아봅시다.");
	}
	
	public AngryTaesan(String day) {
		this.day = day;
		dailyTaesan();
	}
	
	public void setTaesanFeeling(int taesanAnger) {
		this.taesanAnger = taesanAnger;
	}
	
	public String isAngry() {
		switch (taesanAnger) {
		case 10:
		case 9:
			angerGrade = "태산씨가 극대노했습니다. 아무도 말릴 수 없습니다.";
			break;
		case 8:
		case 7:
			angerGrade = "태산씨가 대노했습니다. 목소리가 커지고있습니다.";
			break;
		case 6:
		case 5:
			angerGrade = "태산씨가 중노했습니다. 또 괄호를 안닫은것 같습니다.";
			break;
		case 4:
		case 3:
			angerGrade = "태산씨가 소노했습니다. 태산씨의 혈압이 오르고있습니다.";
			break;
		case 2:
		case 1:
			angerGrade = "태산씨가 평온한 상태입니다.";
			break;

		default:
			return "ㅗ";
		}
		 return angerGrade;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 입력하세요");
		String day = sc.nextLine();
		AngryTaesan taesan = new AngryTaesan(day);
		System.out.println("태산씨가 화가 어느정도 났나요.");
		System.out.println("1~10 사이를 입력하세요");
		taesan.setTaesanFeeling(sc.nextInt());
		System.out.println(taesan.isAngry());
		
	}
}
