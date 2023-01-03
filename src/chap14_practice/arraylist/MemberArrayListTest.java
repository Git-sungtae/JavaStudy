package chap14_practice.arraylist;

import chap14_practice.Member;

public class MemberArrayListTest {
	
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		Member member1 = new Member(101, "장장장");
		Member member2 = new Member(102, "성성성");
		Member member3 = new Member(103, "태태태");
		//add를 사용하여 리스트에 요소 추가해보기
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		
		memberArrayList.showAll();
		
		//remove로 리스트 멤버 지우기
		memberArrayList.removeMember(member1.getMemberId());
		memberArrayList.showAll();
		
	}

}
