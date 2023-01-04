package chap15_practice.hashmap;

import chap15_practice.Member;
import chap15_practice.hashset.MemberHashSet;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberhashMap = new MemberHashMap();
		Member member1 = new Member(101, "장장장");
		Member member2 = new Member(102, "성성성");
		Member member3 = new Member(103, "태태태");
		
		memberhashMap.addMember(member1);
		memberhashMap.addMember(member2);
		memberhashMap.addMember(member3);
		
		memberhashMap.showAllMember();
		memberhashMap.removeMember(102);
		memberhashMap.showAllMember();
	}

}
