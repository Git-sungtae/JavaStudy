package chap13_practice;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		//사용시 T자리에 사용할 클래스를 적으면
		//T가 object로 변환되고 컴파일러가 casting을 해준다.
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
//		System.out.println(printer);
		System.out.println(printer.toString());
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
		//material의 타입은 T이므로 Object타입인 인스턴스가 와야한다(생성자로 생성)
		printer2.setMaterial(new Plastic());
		System.out.println(printer2);
		
		//제네릭도 또한 검증되지않은 obj가 들어올 위험성이 존재한다.
		
//		ThreeDPrinter<Water> brokenPrinter = new ThreeDPrinter<Water>();
//		brokenPrinter.setMaterial(new Water());
//		System.out.println(brokenPrinter);
		
		//이럴땐, 상위클래스나 인터페이스를 만들어서 상속하여 위험성을 차단한다.
		//T  ProperMaterial을 상속하여 T타입에 대한 제한.
		//ThreeDPrinter<T extends ProperMateral>
		//Water은 T타입으로 받아지지 않음
	}

}
