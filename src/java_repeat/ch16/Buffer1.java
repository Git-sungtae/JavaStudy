package java_repeat.ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름은 ?");
		String name = br.readLine();
		System.out.println("주소는 ?");
		String address = br.readLine();
		System.out.println("'"+ name + "'님의 주소는 '" + address + "' 입니다.");
	}

}