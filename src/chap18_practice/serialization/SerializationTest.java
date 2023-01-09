package chap18_practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serialization (직렬화)
//자료형,데이터말고 객체 자체를 읽고 쓰는 스트림
//객체가 인스턴스화 되면 멤버면수 값은 계속 변할수가 있음
//어느 순간의 인스턴스의의 값을 그대로 저장해놓거나, 네트워크에 전송하는것을 직렬화,
//저장해놓은것을 받는쪽이나 파일에서 복원하는 과정을 역직렬화 라고 한다.

class Person implements Serializable{
	/**
	 * 시리얼 번호 자동으로 작성
	 */
	private static final long serialVersionUID = 1854335533001831692L;
	
	String name;
	//transient : 직렬화 제외
	transient String title;
	
	
	public Person() {
		
	}
	
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public String toString() {
		return name + "," + title;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
	
		Person personLee = new Person("Lee", "Manager");
		//객체를 파일에 저장
		//ObjcetOutputStream : 직렬화를 위한 오브젝트의 클래스, 보조스트림
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			//object 저장, serializable 예외발생
			//Person에 serializable 마킹인터페이스 표시
			//객체가 저장되므로, 데이터(객체)의 외부유출을 허용한다는 의미
			oos.writeObject(personLee);
			
		}catch(IOException e) {
			System.out.println(e);
		}
	
		//역직렬화
		//불러오기(읽어오기)
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			//readObject → 리턴타임 Object
			Object obj = ois.readObject();
			if (obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}

}
