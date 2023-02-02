package java_reapeat.ch04;

public class ArrayTest04 {

	public static void main(String[] args) {
		
//		이름	    국어	영어	수학	총점	평균	
//		--------------------------------------------
//		김준수	80	70	90	240	80
//		이하이	70	90	90	250	83
//		안예은	80	70	80	230	76
//		국카스텐	90	90	70	250	83
//		--------------------------------------------
//		총계	    320	320	330	970	80

		String[] subjects = {"이름", "국어", "영어", "수학", "총점", "평균"};
		String[] names = {"김준수", "이하이", "안예은", "국카스텐"};
		int[][] scores = {{80,70,90}, {70,90,90}, {80,70,80}, {90,90,70}};
		int[] total = new int[3];
		double avg = 0;
		double totalAvg = 0;
		int totalSum = 0;
		
		for (String s : subjects) {
			System.out.print(s + "\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		for (int i = 0; i < names.length; i++) {
			int index = 0;
			int sum = 0;
			System.out.print(names[i] + "\t");
			for (int j : scores[i]) {
				sum += j;
				totalSum += j;
				total[index] += scores[i][index];
				index ++;
				System.out.print(j + "\t");
			}
			totalAvg += (double)sum /scores[i].length;
			avg = Math.round((double)sum /scores[i].length);
			System.out.print(sum + "\t" + avg + "\n");
		}
		System.out.println("---------------------------------------------");
		System.out.print("총계\t");
		for (int i : total) {
			System.out.print(i + "\t");
		}
		totalAvg = Math.round(totalAvg / names.length); 
		System.out.println(totalSum + "\t" + totalAvg);
		
	}
}

