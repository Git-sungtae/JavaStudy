package chap06_practice;

class Point{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class Circle{
//	private int x;
//	private int y;// 이미 point에 구현되어있음
	
	Point point; // 이렇게 그냥 point를 변수선언을 하고, 생성자에 추가해서 사용하는것 : Aggregation(합성) → has a 관계
	
	private int radius;
	
	public Circle(){
		point = new Point(); // 생성자에 추가해서 사용
	}
	
	
}



public class Composition {

	//circle이 point를 단순히 사용하고 싶을때는 상속이 아닌 합성을 사용하자!!
	//합성 → 필드에 사용하고 싶은 클래스를 참조변수로 가져다가 사용하는것
}
