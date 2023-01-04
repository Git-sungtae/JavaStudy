package chap15_practice.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chap15_practice.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap(){
		hashMap = new HashMap<Integer, Member>();
	}
	//넣을때는 put, 빼올때는 get
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		//Iterater의 hasNext처럼 containsKey사용
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("존재하지 않는 키입니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> it = hashMap.keySet().iterator();
		
		while (it.hasNext()) {
			int key = it.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
	
	
	
	
	
}
