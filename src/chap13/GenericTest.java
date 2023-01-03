package chap13;

class Ink{
	public String inkColor;
	public Ink(String inkColor) {
		this.inkColor = inkColor;
	}
	
	public void print() {
		System.out.println(inkColor + "색 잉크로 출력합니다.");
	}
}

class Laser{
	public String laserColor;
	public Laser(String laserColor) {
		this.laserColor = laserColor;
	}
	public void print() {
		System.out.println(laserColor + "색 레이저로 출력합니다.");
	}
}

class Printer<T>{
	public T meterial;
	
	public Printer(T meterial) {
		this.meterial = meterial;
	}
}






public class GenericTest {

	public static void main(String[] args) {
		Printer<Ink> Printer1 = new Printer<Ink>(new Ink("파랑"));
		Printer<Laser> Printer2 = new Printer<Laser>(new Laser("검정"));
		
		Printer1.meterial.print();
		Printer2.meterial.print();
		
	}
}
