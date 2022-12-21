package chap06;

 class Constructor {
	
//필드
	String conName;
	String conRank;
	
//생성자
	 Constructor() {
//	public : 클래스의 접근 제어자 공유
//	Constructor : 클래스 이름
//	() {}
	}
	
	//생성자 오버로딩
	 Constructor(String conName) {
		this.conName = conName;
	}
	 
	 Constructor(String conName, String conRank) {
		 this.conName = conName;
		 this.conRank = conRank;
	 }

}
 

public class ConstructorDefinition{
	public static void main(String[] args) {
		
		Constructor con1 = new Constructor("con1");
		con1.conRank = "첫째";
		
		System.out.println(con1.conName);
		System.out.println(con1.conRank);
		
		Constructor con2 = new Constructor("con2", "둘째");
		System.out.println(con2.conName);
		System.out.println(con2.conRank);
		
	}
}
