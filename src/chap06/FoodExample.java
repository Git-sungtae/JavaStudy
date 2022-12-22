package chap06;

class Food{
	
//필드
	private String who;
	private String food;
	private int amount;
	private String member;
	
//생성자
	
//메서드
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}	

	
}





public class FoodExample {

	public static void main(String[] args) {

	Food f = new Food();
	f.setWho("영광");
	f.setMember("혼자");
	f.setFood("떡 한개와 삶은계락 두개를 먹었다.");
	f.setAmount(2);
	
	System.out.print(f.getWho() + "씨가 ");
	System.out.print(f.getMember() + " ");
	System.out.print(f.getFood());	
//	System.out.println(f.getAmount());	
	
	}

}
