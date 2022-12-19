//package chap04;
//
//import java.util.Scanner;
//
//public class breakExample {
//
//	public static void main(String[] args) {
//
//		while (true) {
//			System.out.println("최대숫자를 입력하세요");
//			Scanner maxNum = new Scanner(System.in);
//			String checkNum;
//			checkNum = maxNum.nextLine();
//
//			
//		}
//		while (!maxNum.hasNextInt()) {
//			maxNum.next();
//			System.err.println("1보다 큰 '숫자'를 입력하세요.");
//
//		}
//
//		int maxNumber = maxNum.nextInt();
//		System.out.println("뽑고 싶은 숫자를 입력하세요 범위 : 1~" + maxNumber);
//		int chosenNumber;
//		Scanner chosenNum = new Scanner(System.in);
//		while (true) {
//			chosenNumber = chosenNum.nextInt();
//			if (1 <= chosenNumber && maxNumber >= chosenNumber) {
//				break;
//			} else {
//				System.out.println("범위 내의 숫자를 입력하세요.");
//			}
//		}
//		int count = 0;
//		while (true) {
//			int num = (int) (Math.random() * maxNumber) + 1;
//			count++;
//			System.out.println(count + "번째 시도 : " + num + "를 뽑았다!");
//			if (num == chosenNumber) {
//				System.out
//						.println("정수 1부터 " + maxNumber + "까지 랜덤으로 추출했을때 " + count + "번째에서 " + chosenNumber + "이 나왔어!");
//				break;
//			}
//		}
//
//	}
//}
