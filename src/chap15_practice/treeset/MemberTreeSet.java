package chap15_practice.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import chap15_practice.Member;

public class MemberTreeSet {
		private TreeSet<Member> TreeSet;
		
		public MemberTreeSet() {
			TreeSet = new TreeSet<Member>();
		}
		
		public void addMember(Member member) {
			TreeSet.add(member);
		}
		
		public boolean removeMember(int memberId) {
			Iterator <Member> iterator = TreeSet.iterator();
			while(iterator.hasNext()) {
				Member member = iterator.next();
				
				int tempId = member.getMemberId();
				if(tempId == memberId){
					TreeSet.remove(member);
					return true;
				}
			}
			System.out.println(memberId + "가 존재하지않습니다.");
			return false;
			
		}
		
		public void showAll() {
			
			for (Member member : TreeSet) {
				System.out.println(member);
			}
//			System.out.println(TreeSet);
		}
	}
