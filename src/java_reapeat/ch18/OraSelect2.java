package java_reapeat.ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OraSelect2 {

	public static void main(String[] args) throws SQLException {
		String sql = "select * from emp";
		
		System.out.println("사원명단");
		System.out.println("사원코드\t 사원명\t 업무 \t\t 급여\t 일자");
		System.out.println("===========================================");
		
		try (Connection conn = DriverManager.getConnection(DbConn.url, "scott", "1111");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			Class.forName(DbConn.driver);
			if (rs.next()) {
				//do-while문 : 모든 row가 다 나올 때 까지 계속 loop
				do {
					int empno = rs.getInt(1);
					String ename = rs.getString(2);
					String job = rs.getString(3);
					int sal = rs.getInt("sal");
					Date date = rs.getDate("hiredate");
					
					//job.length()에서 NPE가 뜨기때문에 job에 대한 NPE 예외처리 1)
					if (job == null) {
						job = "";
					}
					/* job.length()에서 NPE가 뜨기때문에 job에 대한 NPE 예외처리 2)
					 * String joblen = ""; if (job == null) { joblen = ""; } else { joblen = job; }
					 * if (joblen.length()>7) { System.out.printf("%d \t%s\t%s\t%d\t%TF\n", empno,
					 * ename, job, sal, date); }
					 */
					
					if (job.length()>7) {
						System.out.printf("%d \t%s\t%s\t%d\t%TF\n", empno, ename, job, sal, date);
					} else {
						System.out.printf("%d \t%s\t%s\t\t%d\t%TF\n", empno, ename, job, sal, date);						
					}
				} while (rs.next());
			} else {
				System.out.println("No more data exists");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
