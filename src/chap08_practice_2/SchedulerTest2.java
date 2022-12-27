package chap08_practice_2;
//default, static, private 메서드
public class SchedulerTest2 {

	public static void main(String[] args) {
		Scheduler sc = null;
		sc = new RoundRobin();
		sc.description();
		//default 메서드를 재정의한 P.A의 메서드가 실행됨.
		//인터페이스의 모든 메서드의 접근제한은 public이다 헷갈리지말자.
		sc = new PriorityAllocation();
		sc.description();
		//인터페이스에서 직접 스태틱 메서드 호출
		System.out.println(Scheduler.isReady());
		//private 메서드인 sayhi 추가
		sc = new RoundRobin();
		sc.description();
		
	}

}
