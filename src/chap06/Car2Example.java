package chap06;

class Car2{
	//필드
	private String company = "현대자동차";
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
	
	Car2(String model, String color, int maxSpeed, String company){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.setCompany(company);
	}
	//게터와 세터 생성
	//private인 company를 외부에서 사용할 수 없으므로,
	//게터를 통해 값을 가져오거나, 세터를 통해 값을 입력한다.
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	
}

public class Car2Example {

	public static void main(String[] args) {

		Car2 mycar1 = new Car2();
		Car2 mycar2 = new Car2("소나타");
		Car2 mycar3 = new Car2("소나타", "흰색");
		Car2 mycar4 = new Car2("소나타", "흰색", 500);
		Car2 mycar5 = new Car2("소나타", "흰색", 1000, "아우디");
		
		System.out.println("mycar1: "+ mycar1.model + " " + mycar1.color + " " + mycar1.maxSpeed );
		System.out.println("mycar2: "+ mycar2.model + " " + mycar2.color + " " + mycar2.maxSpeed );
		System.out.println("mycar3: "+ mycar3.model + " " + mycar3.color + " " + mycar3.maxSpeed );
		System.out.println("mycar4: "+ mycar4.model + " " + mycar4.color + " " + mycar4.maxSpeed );
		System.out.println("mycar: "+ mycar5.getCompany());
		
		System.out.println("-------------------------------------------");
		
		
	}

}
