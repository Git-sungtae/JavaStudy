package chap15_practice;

public class Member {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//HashSet에서 동등객체 기준을 설정하기 위해
	//hashCode와 Equals를 오버라이딩 해야한다.
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member =(Member) obj;
			if (member.memberId == this.memberId) {
				return true;
			} else {
				return false;
			}
			
		}
		return false;
	}

	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString(){
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
}
