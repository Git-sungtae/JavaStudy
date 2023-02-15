package java_reapeat.ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class DbConn2 {
	
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//1) 커넥션 객체 생성
		Connection conn;
		Scanner scanner = new Scanner(System.in);
		//2) 커넥션 객체 연결
		conn = DbConn.connectDB(driver, url, scanner);
		
//		System.out.println("실행할 프로시저 쿼리를 입력하세요");
//		String procedureStmt = scanner.nextLine();
		String sql = "CALL second_max_sal(?)";
		CallableStatement cStmt = conn.prepareCall(sql);
		//3) in/out 파라미터 세팅
		//3-1) in 파라미터
		//cStmt.setString(1, "In 파라미터값");
		cStmt.registerOutParameter(1, java.sql.Types.VARCHAR);
		cStmt.execute();
		String result = cStmt.getString(1);
		System.out.println("=======< 프로시저 실행 완료 >=======");
		System.out.println("실행한 프로시저 : " + sql);
		System.out.println("실행한 결과 값 : " + result);
	}

}
