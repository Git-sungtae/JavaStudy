package chap08_practice;

public interface Calc {
	//필드는 "pulbic static fianl", 적지않아도 컴파일시 자동으로 추가
	double PI = 3.14;
	int ERROR = -99999999;
	
	//메서드는 "public abstract", 적지않아도 컴파일시 자동으로 추가
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int devide(int num1, int num2);
}
