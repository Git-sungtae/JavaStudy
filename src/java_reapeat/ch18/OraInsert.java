package java_reapeat.ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraInsert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";

//		String url = "jdbc:oracle:thin:@[호스트명]:[포트명]:[SID]";
		//cf) 127.0.0.1:1521 = localhost
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		
		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert depno");
		String deptno = sc.nextLine();
//		System.out.println("Insert dname");
//		String dname = sc.nextLine();;
//		System.out.println("Insert loc");
//		String loc = sc.nextLine();;
		
		//'%s' → sql에 문자열 입력해야될때
		String sql = String.format("delete from dept where deptno in(%s)",deptno);
		System.out.println("sql : " + sql);
		
		
		try {
			Class.forName(driver);
			//파라미터((url주소, "USER명", "PW"))
			conn = DriverManager.getConnection(url, "scott", "1111");
			stmt = conn.createStatement();
			
			//업데이트 된 데이터 개수 리턴
			int updateResult = stmt.executeUpdate(sql);
			//업데이트 성공여부 확인
			if (updateResult > 0) {
				System.out.println("삭제 성공");
				System.out.println("결과를 출력하시겠습니까? y/n");
				String wantPrint = sc.nextLine();
				if (wantPrint.equals("y")) {
					String selectSql = "select * from dept";
					ResultSet rs = stmt.executeQuery(selectSql);
					ResultSetMetaData rsMd = rs.getMetaData();
					
					for (int i = 1; i <= rsMd.getColumnCount(); i++) {
						System.out.print(rsMd.getColumnName(i) + "\t");
					}
					System.out.println("\n=============================================");
					
					while (rs.next()) {
						for (int i = 1; i < rsMd.getColumnCount() ; i++) {
							System.out.print(rs.getString(i) + "\t");
						}
						System.out.println();
					}
				} else {
					System.out.println("결과를 출력하지 않고 종료합니다");
				}
				
			} else {
				System.out.println("입력 실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("Scanner closed");
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Connection closed");
		}
		
		
	}

}
