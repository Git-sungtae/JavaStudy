package chap07_practice;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setCustomerID(001);
		customer1.setCustomerName("장성태");
		customer1.setBonusPoint(100);
		System.out.println(customer1.showCustomerInfo());
		
		System.out.println("=====================================");
		
		VipCustomer customer2 = new VipCustomer();
		customer2.setCustomerID(007);
		customer2.setCustomerName("이재용");
		customer2.setBonusPoint(10000);

		System.out.println(customer2.showCustomerInfo());
		
		System.out.println("=====================================");
		
		System.out.println(customer1.calcPrice(10000));
		//System.out.println(customer2.calcPrice(10000));
		//Customer에 없는 saleratio가 vip의 calPrice에는 필요하다 → 오버라이딩을 통해 메서드 변경
		System.out.println(customer2.calcPrice(10000));
	}
	
	

}
