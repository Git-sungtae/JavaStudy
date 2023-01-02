package chap06_practice;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		
		//같은 객체를 참조하고있음
		System.out.println(System.identityHashCode(company));
		System.out.println(System.identityHashCode(company2));
		
		//대표적으로 Calendar클래스가 싱글톤으로 설계되어있음
		Calendar cal = Calendar.getInstance();
		
	}

}
