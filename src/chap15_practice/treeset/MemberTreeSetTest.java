package chap15_practice.treeset;

import chap15_practice.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		Member member1 = new Member(102, "장장장");
		Member member2 = new Member(101, "성성성");
		Member member3 = new Member(103, "태태태");
		
		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		
		memberTreeSet.showAll();
		
	}

}
