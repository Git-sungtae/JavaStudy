package chap10_practice_1;

public class IDFormatTest {

	private String userID;
	
	
	public String getUserID() {
		return userID;
	}

	//set 할때 체크를 할것
	public void setUserID(String userID) throws IDFormatException{
		if (userID == null) {
			throw new IDFormatException("아이디는 null이 될 수 없습니다");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자이상 20자 이하입니다.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {

		IDFormatTest idTest = new IDFormatTest();
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		userID = "123456";
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
