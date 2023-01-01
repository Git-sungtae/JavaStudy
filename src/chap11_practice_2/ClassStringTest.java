package chap11_practice_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassStringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class strClass = Class.forName("java.lang.String");
		//이렇게 불러온 클래스의 정보를 바탕으로 클래스 생성가능
		//로컬이 아닌 remote에서 작업하거나 할 때 쓰는 방법
		
		//클래스의 생성자 불러보기
		Constructor[] cons = strClass.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		//클래스의 필드 불러보기
		Field[] fields = strClass.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		//클래스의 메소드 불러보기
		Method[] methods = strClass.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
	
	}

}
