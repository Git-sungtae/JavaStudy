package chap07_practice;

//등급차등이 있는 고객관리 프로그램
//새로운 VIP 등급인 고객을 따로 관리하기 위한 프로그램 필요 > 상속으로 VipCustomer 클래스 구현
public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int addPoint(int price) {
		int additionlPoint = (int)(price * bonusRatio);
		return additionlPoint;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "입니다.\n현재 보유 포인트는 " + bonusPoint + "p 입니다.";
	}
	
	
	//게터세터
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}
