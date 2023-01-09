package playGround;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class a_Doodle{
	
	public static void main(String[] args) {
		
		byte[] b = new byte[] {1,2,3,4,5};
		try(FileOutputStream fos = new FileOutputStream("C://Users//user/mors.txt")) {
			for (byte c : b) {
				fos.write(c);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		
		FileInputStream fis = null;
		try {
			int i = 0;
			fis = new FileInputStream("C://Users//user/mors.txt");
			while ((i = fis.read()) != -1 ) {
				System.out.print(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
				
		
		
	}

}