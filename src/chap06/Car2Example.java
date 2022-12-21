package chap06;

class Car2{
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	
	
	
	Car2(){
		
	}
	
	Car2(String model){
		this.model = model;
	}
	
	Car2(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	
}

public class Car2Example {

	public static void main(String[] args) {

		Car2 mycar1 = new Car2();
		Car2 mycar2 = new Car2("소나타");
		Car2 mycar3 = new Car2("소나타", "흰색");
		Car2 mycar4 = new Car2("소나타", "흰색", 500);
		
		System.out.println("mycar1: "+ mycar1.model + " " + mycar1.color + " " + mycar1.maxSpeed );
		System.out.println("mycar2: "+ mycar2.model + " " + mycar2.color + " " + mycar2.maxSpeed );
		System.out.println("mycar3: "+ mycar3.model + " " + mycar3.color + " " + mycar3.maxSpeed );
		System.out.println("mycar4: "+ mycar4.model + " " + mycar4.color + " " + mycar4.maxSpeed );
		
		System.out.println("-------------------------------------------");
		
		
	}

}
