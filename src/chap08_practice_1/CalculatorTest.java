package chap08_practice_1;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		Calc cal = new CompleteCalc();
//		Calc cal = new Calc();
//		인터페이스는 객체생성 불가능
//		Calc cal = new Calculator();
//		추상클래스는 객체생성 불가능
		CompleteCalc comCal = new CompleteCalc();
		
		cal.add(1, 2); // calculator 메서드
		cal.devide(1,2);// CompleteCalculator 메서드
		cal.substract(1, 2); //calculator 메서드
		cal.times(1, 2);// CompleteCalculator 메서드
		
		comCal.add(1, 2);// calculator 메서드
		comCal.devide(1, 2);// CompleteCalculator 메서드
		comCal.substract(1, 2);// calculator 메서드
		comCal.times(1, 2);// CompleteCalculator 메서드
		
		
		
	}

}
