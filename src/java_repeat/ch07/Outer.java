package java_repeat.ch07;

public class Outer {
	
	int width = 10;
	int height = 10;
	
	public Outer(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//Class in Class
	
	class Inner{
		int depth = 10;
		public int volumn() {
			return width * height * depth;
		}
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
}
