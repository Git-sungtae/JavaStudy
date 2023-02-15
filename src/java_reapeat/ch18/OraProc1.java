package java_reapeat.ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLType;
import java.sql.Types;
import java.util.Scanner;

public class OraProc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("deptno 입력 ");
		String deptno = sc.nextLine();
		System.out.println("dname 입력 ");
		String dname = sc.nextLine();
		System.out.println("loc 입력 ");
		String loc = sc.nextLine();
		
		//****프로시저나 함수를 사용할 때는 중괄호를 반드시 써야한다
		String sql = "{call second_max_sal(?)}";
		
		/*
		 * Callabel Statement를 통해 프로시저 호출
		 * CallableStatement cstmt = null;
		 */
		
		try (Connection conn = DriverManager.getConnection(DbConn.url, "scott", "1111");
				CallableStatement cstmt = conn.prepareCall(sql)){
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.setString(1, deptno);
			cstmt.setString(2, dname);
			cstmt.setString(3, loc);
//			System.out.println(cstmt.execute());
//			System.out.println(cstmt.getString(1));
			if (cstmt.execute()) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
