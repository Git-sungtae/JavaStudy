package toyProject;

public class MemberSilver extends Member{
	//필드
	//생성자
	public MemberSilver(String name) {
		super(name);
		this.memberName = name;
		this.memberGrade = "실버";
		this.pointRatio = 0.01;
		this.pointSaleRate = 0.05;
	}
	
	//메서드
}
