package java_reapeat.ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConn {
	/* Statement 객체로 select update 실행해보기 */
	public static final String driver = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	
	public static void main(String[] args) throws SQLException{
		//driver : ojdbc6.jar파일의 디렉토리
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String url = "jdbc:oracle:thin:@IP주소:SID:포트번호";
		Connection conn;
		
		Scanner scanner = new Scanner(System.in);
		conn = connectDB(driver, url, scanner);
		
		//statement 객체 생성
		Statement stmt = conn.createStatement();
		System.out.println("적용할 쿼리문을 입력하세요");
		String sqlStmt = scanner.nextLine();
		//resultSet : select의 결과를 받아오는 객체
		ResultSet rs = stmt.executeQuery(sqlStmt);
		ResultSetMetaData rsMd = rs.getMetaData();
		int columnCount = rsMd.getColumnCount();

		
		for (int i = 1; i <= columnCount; i++) {
			System.out.print(rsMd.getColumnName(i) + "\t");
		}
		System.out.println("\n=============================================");
		
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		/* UPDATE문 적용
		 * String sqlStmt = new String();
		 * System.out.println("쿼리문을 적용합니다."); for (int i = 1; i < 5; i++) { sqlStmt =
		 * "update dept set dname = '자바2" + i + "' where deptno = 9" + i;
		 * stmt.executeUpdate(sqlStmt); } System.out.println("쿼리문이 적용되었습니다.");
		 */		
		
		/*
			Connection, scanner close
		*/		if (conn != null) {
			conn.close();
			scanner.close();
			System.out.println("conn and scanner closed");
		}
		
		
	}

	public static Connection connectDB(String driver, String url, Scanner scanner) throws SQLException {
		try {
			//JDBC 드라이버 로드
			Class.forName(driver);
			System.out.println("아이디를 입력하세요");
			String userId = scanner.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String userPass = scanner.nextLine();
			//데이터베이스 연결
			Connection conn = DriverManager.getConnection(url, userId, userPass);
			System.out.println("Start");
			if (conn != null) {
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
