package toyProject;

public class MemberTest {
	
	public static void main(String[] args) {
		
		Member member1 = new Member("장성태");
		member1.setMemberGrade("VIP");
		System.out.println(member1.getMemberName());
		System.out.println(member1.getMemberGrade());
		
		MemberSilver memberS = new MemberSilver("실버맨");
		System.out.println(memberS.getMemberName());
		
		
	}

}
