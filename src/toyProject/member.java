package toyProject;

public class member {
		
//필드
	/*
	 * ID, PASSWORD, 주소, 이메일, 전화번호, 성별
	 * 타입 : default
	 * 작성자 : 장성태
	 */
	String memberId;
	String memberPw;
	String memberAddress;
	String memberEmail;
	String memberPhone;
	String memberGender;
//생성자
	public member(String memberId, String memberPw, String memberAddress, String memberEmail, String memberPhone,
			String memberGender) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberAddress = memberAddress;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberGender = memberGender;
	}
		
//메서드
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
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

}
