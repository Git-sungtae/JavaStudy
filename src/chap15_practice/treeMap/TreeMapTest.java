package chap15_practice.treeMap;

import chap15_practice.Member;

public class TreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap membertreeMap = new MemberTreeMap();
		Member member1 = new Member(101, "장장장");
		Member member2 = new Member(102, "성성성");
		Member member3 = new Member(103, "태태태");
		
		membertreeMap.addMember(member1);
		membertreeMap.addMember(member2);
		membertreeMap.addMember(member3);
		
		membertreeMap.showAllMember();
//		membertreeMap.removeMember(102);
//		membertreeMap.showAllMember();
	}

}
