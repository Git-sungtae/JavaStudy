package playGround;

class Test{
	
	public String toString() {
		return "Test 출력";
	}
	
}

class GeneClass<T>{
	
	T t;
	
	public <T> void method(T t){
		System.out.println(t);
	}
	
	
}

public class Doodle{
	
	public static void main(String[] args) {
		GeneClass<String> gc = new GeneClass<>();
		gc.method("바보");
		System.out.println("===============");
		gc.method(new Test());
	}
}