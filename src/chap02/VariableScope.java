package chap02;

public class VariableScope {

	public static void main(String[] args) {

		int v1 = 15;
		if(v1>10) {
			int v2 = v1-10;
			int v3 = v1 - v2 +5;
			System.out.println(v3);
		}
		
		//int v3 = v1 - v2 +5;
		//error! : v2는 if문 안에서만 사용되는 로컬변수이기 때문
		//int v3 = v1 - v2 +5;를 안쪽에 추가하면 사용 가능
		
		
	}

}
