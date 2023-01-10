package chap18_practice.inputstream.reader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("reader.txt");
				FileWriter fw = new FileWriter("writer2.txt")){
			int i=0;
			char c;
			char[] chBuff = new char[2048];
			
			while((i=fr.read())!= -1) {
				fw.write(i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
