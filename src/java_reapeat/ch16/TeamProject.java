package java_reapeat.ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TeamProject {

	public static void main(String[] args) throws IOException {
		InputStream is = new BufferedInputStream(new FileInputStream("input.txt"));
		OutputStream os = new BufferedOutputStream(new FileOutputStream("b.txt", false));
		
		int i = 0;
		while ( (i = is.read()) != -1) {
			os.write(i);
		}
		
		is.close();
		os.close();
//		File file = new File("sdfsadfsdf");		
		
	}

}
