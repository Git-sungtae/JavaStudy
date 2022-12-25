package chap06_practice;
//추가할 기능 : 담당삼당원 배정 추가, 상품할인률 추가,보너스적립률 수정
public class VipCustomer extends Customer{

	private int agentID;
	private double saleRatio;
	//생성자	
	public VipCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	//메서드
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - ((int) (price * saleRatio));
	}
	
}
