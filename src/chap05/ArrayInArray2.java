package chap05;

public class ArrayInArray2 {

	public static void main(String[] args) {

		//배열 속의 배열
		
		int[][] score = new int[2][3];
		
		System.out.println(score.length); //2
		
		//배열 전체의 길이는 2로 출력됨(행 기준)
		//"행기준이지만 수학적 행의 의미가 아닌 계단식 몇층인지 이다.(162p)
		
		System.out.println(score[0].length); //3
		System.out.println(score[1].length); //3
		
		//"0번 인덱스"의 길이. "계단식 구조" ㅡ> 3
				
		
	}//메인

}
