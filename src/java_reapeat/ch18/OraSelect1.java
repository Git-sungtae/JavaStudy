package java_reapeat.ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraSelect1 {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("부서 코드를 입력하세요");
		int deptno = sc.nextInt();
		
		String sql = "Select dname, loc from dept where deptno = " + deptno;
		
		//DB연결
		Connection conn = null;
		//SQL 문장 수행 객체 선언
		Statement stmt = null;
		//SELECT 실행 내용을 받아놓는 객체
		ResultSet rs = null;
		
		try {
			Class.forName(DbConn.driver);
			conn = DriverManager.getConnection(DbConn.url, "scott", "1111");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				//파라미터 : 컬럼명
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				//파라미터 : SELECT절에서의 컬럼 순번
//				String dname = rs.getString(1);
//				String loc = rs.getString(2");
				System.out.println("부서번호 : " + deptno);
				System.out.println("부서이름 : " + dname);
				System.out.println("부서위치 : " + loc);
			} else {
				System.out.println("자료가 없어요");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				rs.close();
				stmt.close();				
				conn.close();	
			}
		}
	}
