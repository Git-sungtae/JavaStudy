package java_repeat.ch07;

public class Engine {
	String type;
	int cc;
	
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	
	void print() {
		System.out.println("type : " + type);
		System.out.println("cc : " + cc);
	}
}
