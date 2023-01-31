package java_reapeat.ch05;

class OverLoading{
	String name;
	int age;
	String gender;
	
	public OverLoading() {
	}
	
	public OverLoading(int a) {
		age = a;
	}
	
	public OverLoading(String str) {
		name = str;
	}
	
	public OverLoading(String str, int age) {
		name = str;
		this.age = age;
	}
	
	
	
	void print() {
		System.out.println("=====================");
		System.out.println("name-> " + name);
		System.out.println("age-> " + age);
	}
}

public class OverLoadingEx {

	public static void main(String[] args) {

		OverLoading ov1 = new OverLoading();
		OverLoading ov2 = new OverLoading(25);
		OverLoading ov3 = new OverLoading("김영광");
		OverLoading ov4 = new OverLoading("김영광", 99);
		
		ov1.print();
		ov2.print();
		ov3.print();
		ov4.print();
		
	}

}
