package java_reapeat.ch08;

public interface Lenderable {
	//static final<이 생략됨
	int borrow = 1;
	int normal = 0;
	//abstract< 가 생략됨
	void chechOut(String borrower, String date);
	void checkin();
}

class SeperateVolume implements Lenderable{
	
	String title;
	String date;
	String borrower;
	int status;
	
	
	public SeperateVolume(String title) {
		this.title = title;
	}

	@Override
	public void chechOut(String borrower, String date) {
		if (status != normal) {
			return;
		}
		this.date = date;
		this.borrower = borrower;
		status = borrow;
		
		System.out.println(borrower + "가 " + date + "일에 " + title + "을 대여했다.");
	}

	@Override
	public void checkin() {
		if (status != borrow) {
			return;
		}
		System.out.println(borrower + "가 " + date + "일에 " + title + "을 반납했다.");
		date = null;
		title = null;
		borrower = null;
		status = normal;
	}
	
}