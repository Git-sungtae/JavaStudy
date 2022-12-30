package chap11_practice_1;


class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + "," +"y="+y; 
	}
	
}

class Circle implements Cloneable{
	
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x,y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 " + this.point + "이고, 반지름은" + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}



public class ObjectCloneTest {
	
		public static void main(String[] args) throws CloneNotSupportedException{

		Circle circle = new Circle(10, 20, 5);
		//circle.clone의 리턴타입은 오브젝트이므로 dowcasting 해야함
		Circle cloneCircle = (Circle)circle.clone();
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
		
		System.out.println(circle.toString());
		System.out.println(cloneCircle.toString());
		
	}

}
