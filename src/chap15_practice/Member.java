package chap15_practice;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
	
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

	@Override
	//Tree에 객체를 새로 넣을 때 기존의 객체와 "무엇을 기준으로" 비교를 할 것인가.
	//Comprable 인터페이스를 구현하면 compareTo를 구현해야함
	public int compareTo(Member member) {
		//compareTo의 리턴값이 양수로 세팅하면 : 오름차순 정렬 Tree가 됨
//		return (this.memberId - member.memberId);
		//음수로 되게 세팅하면 내림차순 정렬 Tree
//		return (member.memberId - this.memberId);
		//이름으로 비교하게 설정
		//String에는 compareTo가 오버라이딩 되어있고,
		//기본값은 alphabetical 오름차순으로 정렬되어있음
		//alphabetical 역순으로 하고싶으면 음수로 만들면 됨 *(-1)
		return this.memberName.compareTo(member.memberName);
	}
	//Comparator를 구현하면 compare을 구현해야함
	//Comparable이 구현된 클래스가있는데, 기준을 바꾸고 싶을 때 Comparator를 구현하면 된다.
	//이때, comparator를 사용하려면, treeSet 생성자에 Comparator가 구현된 객체를
	//매개변수로 전달하여야 한다.
	// TreeSet<Member> treeSet = new TreeSet<Member>(new member());
	@Override
	public int compare(Member o1, Member o2) {
		return (o1.memberId-o2.memberId);


	}
}
