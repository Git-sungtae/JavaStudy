package chap15_practice.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chap15_practice.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//remove 메서드 만들어보기
	//size만큼 for문을 돌려서 member에 객체를 담고(by get(i))
	//객체의 memberId를 가져와서 변수(tempId)에 저장한 후
	//tempId와 매개변수인 memberId로 비교해서 같으면
	//i번째 객체를 삭제(by remove(i)) → return true
	//for문을 다 돌았음에도 일치하는게 없다면(for문 밖에서) → return false
	public boolean removeMember(int memberId) {
//		for (int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if (memberId == tempId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		/*for(int i=0 ; i<arrayList.size() ; i++){
			int tempId = arrayList.get(i).getMemberId();
			if(tempId == memberId){
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지않습니다.");
		return false;*/
		
		//반복문이 아닌 Iterator로 rmmove 구현
		Iterator <Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId){
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지않습니다.");
		return false;
		
	}
	
	public void showAll() {
//		for (Member member : arrayList) {
//			System.out.println(member);
//		}
		System.out.println(arrayList);
	}
}
