package chap06_practice;
//Singleton
public class Company {
	//클래스 내부에서 유일하게 인스턴스를 하나 만들어놓는다.
	//private생성자를 썼기때문에 외부에서는 만들 수 없고, 내부에 생성된
	//인스턴스만 사용하게 하기 위함임
	private static Company instance = new Company();
	//직접 생성자를 생성하여 default생성자를 사용하지못하게 private을 검
	//외부에서 생성자를 호출하지 못하게하기 위해
	private Company() {
	}	
	//내부에있는 유일한 인스턴스를 외부에서 호출하는 메서드를 만듬
	//인스턴스를 만들고 호출해야하지만 싱글톤이라 인스턴스를 만들 수없다.
	//static 메서드로 선언하여 객체생성 없이 사용할 수 있도록 함.
	public static Company getInstance() {
		//null인경우 하나를 새로만들어서, 항상 같은 인스턴스를 리턴하도록함
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
