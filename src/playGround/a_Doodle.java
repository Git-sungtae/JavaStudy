package playGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a_Doodle{
	
	public static void main(String[] args) {
		int[] intArr = new int[] {1,2,5,7,8,9,10};
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < intArr.length; i++) {
			arrList.add(intArr[i]);
		}
		System.out.println(arrList);
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(list);
		
		
	}

}