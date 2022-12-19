package chap04;

public class BreakExample2 {

	public static void main(String[] args) {
		int cnt=0;
		while (true) {
			int number = (int)(Math.random()*18)+1;
			System.out.println(number);
			cnt++;
			
			if (number == 18) {
				System.out.println(cnt + "번째에 나왔음");
				break;
			}
			
		}

	}

}
