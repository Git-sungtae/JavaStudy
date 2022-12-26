package toyProject;

public class Member {
	//필드
	/*
	 * ID, PASSWORD, 주소, 이메일, 전화번호, 성별
	 * 총 포인트, 등급, 적립률, 할인률 
	 */
	protected String memberName;
	public String memberId;
	protected String memberPw;
	protected String memberAddress;
	protected String memberEmail;
	protected int memberPhone;
	public String memberGender;
	

	public String memberGrade;
	
	protected double pointRatio;
	protected double pointSaleRate;
	public int pointTotal;
	
//생성자
	public Member(String name) {
		this.memberName = name;
	}
		
//메서드
	/*
	 * 포인트 적립
	 */
	public void addPoint(int price) {
		pointTotal += (price * pointSaleRate * pointRatio);
	}
	
	
	
	
	/* 
	 * 필드 getter, setter
	 * 작성자 : 장성태
	 */
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public int getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(int memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	
	public void setPointRatio(double pointRatio) {
		this.pointRatio = pointRatio;
	}

	public double getPointSaleRate() {
		return pointSaleRate;
	}

	public void setPointSaleRate(double pointSaleRate) {
		this.pointSaleRate = pointSaleRate;
	}

	public int getPointTotal() {
		return pointTotal;
	}

	public void setPointTotal(int pointTotal) {
		this.pointTotal = pointTotal;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	
	public double getPointRatio() {
		return pointRatio;
	}


}
