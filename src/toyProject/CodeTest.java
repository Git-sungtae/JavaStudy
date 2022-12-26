package toyProject;

public class CodeTest {
	public int soulution(int[] common) {
		
	    int answer = 0;
		int[] intArr = new int[common.length];
		for (int i = 0; i < intArr.length; i++) {
				intArr[i] = common[i];
			}
			
		if (((double)intArr[1]/intArr[0]) == ((double)intArr[2]/intArr[1])) {
				answer = (int)(intArr[intArr.length-1] * ((double)intArr[1]/intArr[0]));
			} else {
				answer = intArr[intArr.length-1] + (intArr[1] - intArr[0]);
			}
			
			return answer;	
		}
	
	public static void main(String[] args) {
		CodeTest co1 = new CodeTest();
		int[] arr2 = {2,4,8,16,32,64,128}; 
		System.out.println(co1.soulution(arr2));
	}
}