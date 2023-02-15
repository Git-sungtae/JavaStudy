package java_reapeat.ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraUpdate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 deptno 입력 ");
		String deptno = sc.nextLine();
		System.out.println("수정할 dname 입력 ");
		String dname = sc.nextLine();
		System.out.println("수정할 loc 입력 ");
		String loc = sc.nextLine();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String sql = String.format("UPDATE dept"
				+ "					SET"
				+ "						dname = '%s',"
				+ "						 loc = '%s'"
				+ "					WHERE deptno = %s"
									, dname, loc, deptno);
		
		Connection conn = null;
		Statement stmt = null;
		
		try{
			conn = DriverManager.getConnection(url, "scott", "1111");
			stmt = conn.createStatement();
			Class.forName(driver);
			int result = stmt.executeUpdate(sql);
			System.out.println("사용 sql문 : " + sql );
			if (result != 0) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
		} catch(Exception e){
			System.out.println(e);
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
