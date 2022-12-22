package chap06;

class Car3{
	
	//필드
		private int speed;
		private boolean stop;
		
	//생성자
		
	//메서드
		//외부 데이터를 받아와서 입력하기위한 메서드 → setter
		//세터에 원하는 데이터 검증 *-을 넣을 수 있다.
		//스피드이므로 음수를 걷어내는 데이터 검증과정 추가
		public void setSpeed(int speed){
			if (speed<0) {
				//speed가 음수이면, 0으로 초기화하고
				//return을 실행하여 메서드 종료(void 이므로 return 사용시 종료)
				//이런 코드를 세터의 "검증코드" 라고 한다.
				this.speed = 0;
				return;
			}
			this.speed = speed;
		}
		
		//클래스의 데이터가 외부 객체에서 사용 가능하지않을때(변환이 필요할떄)
		//클래스의 데이터를 알맞게 변환시켜주는 메서드 → setter
		//mile기준인 클래스의 데이터를 외부객체 km로 변환하는 과정 추가
		public double getSpeed() {
			//getter는 파라미터 필요없음
			//(외부객체에서 클래스내부 데이터를 가져오는것이므로)
			//이런 코드를 게터의 "변환코드"라고 한다.
			double km = 1.6 * speed;
			return km;
		}

		//자동생성을 통해 만든 stop의 게터와 세터
		public boolean isStop() {
			return stop;
		}

		public void setStop(boolean stop) {
			this.stop = stop;
		}
		
		
	}

public class Car3Example {

	public static void main(String[] args) {

		Car3 mycar = new Car3();
		
		//데이터를 바로 객체에 입력하는경우
		//데이터를 검증없이 바로 입력하기 때문에, 객체의 무결성에 문제가 생길 가능성이 있다.
//		mycar.speed = 10; //error: speed가 private
		mycar.setSpeed(10);
		
		//
		
	}

}
