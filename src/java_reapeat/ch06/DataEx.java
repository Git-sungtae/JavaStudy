package java_reapeat.ch06;

//***call by reference와 call by value
class Data{
	int kor;
	int eng;
	int math;
	
	//call by reference 참조에 의한 호출
	void addRef(Data d1, Data d2) {
		d1.kor = d2.eng;
		System.out.println("call by reference addRef Method 국어 점수: " + d1.kor);
	}
	
	//call by value 값에 의한 호출
	void addValue(int a, int b) {
		a = b;
		System.out.println("call by value addValue Method 국어 점수: " + a);
	}
	
}

public class DataEx {

	public static void main(String[] args) {

		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.kor = 50;
		d1.math = 70;
		d2.eng = 80;
		// 객체, 배열, String이 넘어감
		d3.addRef(d1, d2);
		System.out.println("Main 국어 점수 : " + d1.kor);
		// Primitive 변수가 넘어감
		int a = 5;
		int b = 10;
		d3.addValue(a, b);
		// 값이 넘어가기 때문에 메서드 내에서는 사용되지만, 밖에서 참조하면 값이 변하지않는다.
		System.out.println("Main 국어 점수 : " + d3.kor);
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	

}
