package java_reapeat.ch07;

public class CarEx {
	String kind;
	int kkk = 0;
	//객체에서 객체를 사용하는 방법
	//1. 상속관계 사용
	//2. 연관관계 사용(Association)
	Engine eg;
	//방법 1) Engine eg = new Engine()
	//방법 2) 생성자에서 매개변수로 받는 방법
	CarEx(String kind, Engine eg){
		this.kind = kind;
		this.eg = eg;
	}
	
	void print() {
		System.out.println("종류 : " + kind);
		this.kkk++;
		eg.print();
		System.out.println("=========kkk-> " + this.kkk);
	}
	
	public static void main(String[] args) {
		
		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);
		
		CarEx[] car = new CarEx[3];
		car[0] = new CarEx("모닝", eg1);
		car[1] = new CarEx("벤츠", eg1);
		car[2] = new CarEx("아우디", eg2);
		
		for (CarEx carEx : car) {
			carEx.print();
		}
		
	}

}
