
package chap09_practice;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass;
	
	public OutClass() {
		//인스턴스 내부클래스인 경우, Outclass의 생성자에서 생성
		inClass = new InClass();
	}
	
	class InClass{
		int inNum=200;
		//Out클래스의 인스턴스가 생성될떄 InClass가 생성되므로
		//인스턴스의 생성과 독립적인 static변수는 "선언" 불가
//		static sInNum = 100;
		
		public void inTest() {
			//외부 전역변수 사용가능
			System.out.println(num);
			System.out.println(sNum);
		}
		
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	//static 내부 클래스
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//외부 인스턴스 변수 사용 불가능
//			num+=10;
			//static 변수는 사용 가능
			sNum+= 10;
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest(){
			System.out.println(sNum);
			//staic클래스의 인스턴스 변수이므로 사용 불가
//			System.out.println(iNum);
			System.out.println(sInNum);
			
		}
	}
	
	
	
}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.inClass.inTest();
		
		OutClass.InClass inClass = outClass.new InClass();
		
		outClass.usingInTest();
		
	}

}
