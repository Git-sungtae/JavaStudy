package java_reapeat.ch12;

class Account2User extends Thread {
	Account2 account2;
	boolean flag;
	String name;
	
	public Account2User(Account2 account2, String name) {
		super();
//		super(name);
		this.name = name;
		this.account2 = account2;
	}
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (account2) {
				if(flag) account2.deposit((int)(Math.random()*10000), this.name);
				else account2.withdraw((int)(Math.random()*10000), this.name);
				flag = !flag; //flag Swap
			}
		}
	}
}

public class Account2Ex {

	public static void main(String[] args) {
		Account2 act1 = new Account2(10000); // 여자그룹 계좌 
		Account2 act2 = new Account2(15000); // 남자그룹 계좌 
		
//		여자그룹(옥주현, 조정은, 정선아) / 남자그룹(김준수, 전동석, 싱성록)
		Account2User au1 = new Account2User(act1, "옥주현");
		Account2User au2 = new Account2User(act1, "조정은");
		Account2User au3 = new Account2User(act1, "정선아");
		Account2User au4 = new Account2User(act2, "김준수");
		Account2User au5 = new Account2User(act2, "전동석");
		Account2User au6 = new Account2User(act2, "신성록");

		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();
	}

}

//Bank --> 간단한 잔액 관리
class Account2 {
	int total; //잔액
	
	public Account2(int total) {
		this.total = total;
	}
	
	//예금
	void deposit(int amt, String name) {
		total += amt;
		System.out.println(name + " 예금 : " + amt );
	}
	
	//인출
	void withdraw(int amt, String name) {
		if(amt <= total) {
			total -= amt;
			System.out.println(name + " 출금 " + amt);
			getTotal();
		} else {
			System.out.println("\u001B[31m" + name + "의 출금 요청 " + amt + " 잔액부족 저금좀 해 --> 현재 잔액: " + total);
		}
	}
	
	//잔액 조회
	void getTotal() {
		System.out.println("잔액 : " + total);
	}

}