package java_reapeat.ch12;

import playGround.Font;

class Atm extends Thread {
	Account account;
	boolean flag;
	String name;
	
	public Atm(Account account, String name) {
		super();
//		super(name);
		this.name = name;
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (account) {
				
			}
			
			if(flag) {
				account.deposit((int)(Math.random()*10000), this.name);
			}else {
				account.withdraw((int)(Math.random()*10000), this.name);
			}
			flag = !flag; //flag Swap
		}
	}
}

public class AtmEx {

	public static void main(String[] args) {
		Account account1 = new Account(10000, "김영광");  
		Account account2 = new Account(15000, "김태산");  
		
//		여자그룹(옥주현, 조정은, 정선아) / 남자그룹(김준수, 전동석, 싱성록)
		Atm atm1 = new Atm(account1, "신한Atm");
		Atm atm2 = new Atm(account1, "국민Atm");
		Atm atm3 = new Atm(account1, "농협Atm");
		Atm atm4 = new Atm(account2, "신한Atm");
		Atm atm5 = new Atm(account2, "국민Atm");
		Atm atm6 = new Atm(account2, "농협Atm");

		atm1.start();
		atm2.start();
		atm3.start();
		atm4.start();
		atm5.start();
		atm6.start();
	}

}

//Bank --> 간단한 잔액 관리
class Account {
	int total; //잔액
	String name;
	
	public Account(int total, String name) {
		this.total = total;
		this.name = name;
	}
	
	//예금
	void deposit(int amt, String atmName) {
		total += amt;
		System.out.println(this.name + "이 " +  atmName + "에서 입금 요청\t입금액 : " + amt + "\t" + getTotal());
	}
	
	//인출
	void withdraw(int amt, String atmName) {
		if(amt <= total) {
			total -= amt;
			System.out.println(this.name + "이 " +  atmName + "에서 출금 요청\t출금액 : " + amt + "\t" + getTotal());
		} else {
			System.out.println(Font.highlightBlack( this.name + "이 " + atmName + "에서의 " + Font.colorRed("출금 요청 거절") + Font.BACKGROUND_BLACK +"\t 요청금액 : " + amt + "\t" + getTotal() + Font.colorRed("\t 부족금액 : " + (amt-total))));
		}
	}
	
	//잔액 조회
	String getTotal() {
		return ("잔액 : " + total);
	}

}