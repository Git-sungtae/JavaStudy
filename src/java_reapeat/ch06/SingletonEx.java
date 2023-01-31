package java_reapeat.ch06;

class Singleton{
	String str;
	private static Singleton instance;
	//생성자를 private로 선언함으로 아무나 생성하지 못하도록 함(핵심부분)
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class SingletonEx {

	public static void main(String[] args) {

		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		st1.str = "스스로 있는자";
		System.out.println(st2.str);
		if (st1 == st2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}

}
