package chap06;

class Singleton {
	
	private static Singleton singleton = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return singleton;
	}

}

public class SingletonExample{
	
	public static void main(String[] args) {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));
	}
	
}
