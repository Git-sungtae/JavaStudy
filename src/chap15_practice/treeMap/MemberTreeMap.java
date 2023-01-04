package chap15_practice.treeMap;

import java.util.Iterator;
import java.util.TreeMap;

import chap15_practice.Member;

public class MemberTreeMap {
	//지금은 Key값이 Integer이므로, 
	//Integer에 있는 comparator를 호출하여 sorting된다
	private TreeMap<Integer, Member> TreeMap;
	
	public MemberTreeMap(){
		TreeMap = new TreeMap<Integer, Member>();
	}
	public void addMember(Member member) {
		TreeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if (TreeMap.containsKey(memberId)) {
			TreeMap.remove(memberId);
			return true;
		}
		System.out.println("존재하지 않는 키입니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> it = TreeMap.keySet().iterator();
		
		while (it.hasNext()) {
			int key = it.next();
			Member member = TreeMap.get(key);
			System.out.println(member);
		}
	}
}
