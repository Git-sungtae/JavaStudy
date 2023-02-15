package java_reapeat.ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class OreProc3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 Oracle 사원코드 ?");
		String empno = sc.nextLine();

		//Function의 호출
		//y = x의 모양으로
		//1번째 ? 는 out param, 2번째 ?는 in param
		//in param으로 사번을, out param으로 sal을 인상하고, 변경된 급여를 가져오는 function
		String sql = "{? = call sal_func(?)}";
		
		try (Connection conn = DriverManager.getConnection(DbConn.url, "scott", "1111");
				CallableStatement cstmt = conn.prepareCall(sql)){
			cstmt.setString(2, empno);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			int newSal = cstmt.getInt(1);
			if (newSal > 0) {
				System.out.println("수정 성공");
				System.out.println("사번" + empno);
				System.out.println("변경된 급여 : " + newSal);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
