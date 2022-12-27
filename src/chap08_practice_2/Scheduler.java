package chap08_practice_2;

public interface Scheduler {
	
	void getNextCall();
	void sendCallToAgent();
	
	default void description() {
		sayHi();
		System.out.println("스케쥴러 인터페이스를 구현합니다.");
	}
	
	static boolean isReady() {
		return true;
	}
	
	private void sayHi() {
		System.out.println("안녕하십니까 고객님");
	}
	
}

class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
		
	}
	
}

class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나, 상담대기가 가장 적은 상담원에게 할당합니다.");
		
	}
	
}

class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 우선 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 Skill이 가장 높은 상담원이 대기열 앞에 우선 배분합니다.");
	}
	
	@Override
	 public void description() {
		System.out.println("VIP전용 스케쥴러 인터페이스를 구현합니다.");
	}
	
}
