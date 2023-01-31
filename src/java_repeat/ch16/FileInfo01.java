package java_repeat.ch16;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileInfo01 {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		File file = new File(path + "\\src\\java_repeat.ch16\\buffer1.java");
		System.out.println("Directory: " + file.isDirectory());
		System.out.println(" 파일 상세 정보 *********** ");
		System.out.println("절대 경로: " + file.getAbsolutePath());
		System.out.println("표준 경로: " + file.getCanonicalPath());
		System.out.println("생성일: " + new Date(file.lastModified()));
		System.out.println("파일 크기: " + file.length());
		System.out.println("읽기 속성: " + file.canRead());
		System.out.println("쓰기 속성: " + file.canWrite());
		System.out.println("파일 경로: " + file.getParent());
		System.out.println("숨김 속성: " + file.isHidden());

	}

}
