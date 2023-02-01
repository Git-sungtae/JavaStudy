package java_reapeat.ch11;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException{

		Properties pt = new Properties();
		
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		//디코딩을 하지않고 읽으면 특수문자들이 아스키코드로 출력됨
		System.out.println("1-1 path : " + path);
		//디코딩을 하면 특수문자들이 제대로(Utf-8형식으로) 출력됨
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("1-2 path : " + path);
		//properties는 맵 계열이기 key와 value로 나누어 저장하는데,
		//properties는 = 을 중심으로 왼쪽은 key이고 오른쪽이 value이다.
		pt.load(new FileReader(path));

		//.getProperty(key) → driver(key) = oracle.jbdc.OracleDriver(value)
		String driver = pt.getProperty("driver");
		System.out.println("2. 드라이버 : " + driver);
		String url = pt.getProperty("url");
		System.out.println("3. url : " + url);
		
		String username = pt.getProperty("username");
		System.out.println("4. username : " + username);
		String password = pt.getProperty("password");
		System.out.println("5. pass : " + password);
		
		System.out.println("=====================================");
		int i = 1;
		for (Entry<Object, Object> e : pt.entrySet()) {
//			String eKey = (String)e.getKey();
//			String eValue = (String)e.getValue();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}

}
