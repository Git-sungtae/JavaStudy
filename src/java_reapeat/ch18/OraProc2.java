package java_reapeat.ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class OraProc2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int empno = sc.nextInt();
		String sql = "{call emp_info2(?,?,?)}";
		
		try(Connection conn = DriverManager.getConnection(DbConn.url, "scott", "1111");
				CallableStatement cstmt = conn.prepareCall(sql)) {
			
			cstmt.setInt(1, empno);			
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.INTEGER);
			
			cstmt.executeQuery();
			
			System.out.println("empno : " + empno);
			System.out.println("ename : " + cstmt.getString(2));
			System.out.println("sal : " + cstmt.getInt(3));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
