package chap15_practice.hashset;

import chap15_practice.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberhashSet = new MemberHashSet();
		Member member1 = new Member(101, "장장장");
		Member member2 = new Member(102, "성성성");
		Member member3 = new Member(103, "태태태");
		
		memberhashSet.addMember(member1);
		memberhashSet.addMember(member2);
		memberhashSet.addMember(member3);
		
		memberhashSet.showAll();
		System.out.println("===========================");
		//memberId가 같은데도 추가가 된다.
		//hashCode()와 Equals()가 오버라이딩되어있지않았기 때문
		Member member1_1 = new Member(101, "짱짱짱");
		//메서드를 오버라이딩 하고 나서는 짱짱짱이 들어가지 않음
		memberhashSet.addMember(member1_1);
		memberhashSet.showAll();
		
	}

}
