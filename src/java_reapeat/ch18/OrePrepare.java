package java_reapeat.ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*Prepared Statement 객체 사용
 * 일반 Statement와의 차이
 * 1) 가독성이 더 뛰어남
 * 2) 보안에 유리하다.*/

public class OrePrepare {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("deptno 입력 ");
		String deptno = sc.nextLine();
		System.out.println("dname 입력 ");
		String dname = sc.nextLine();
		System.out.println("loc 입력 ");
		String loc = sc.nextLine();
		
		//파라미터(?,?,?) 사용가능
		String sql = "insert into dept values(?,?,?)";
		
		/*6버전 이후 서비스로더가 추가되어 더이상 사용하지 않아도 된다.
		try {
			Class.forName(DbConn.driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		try(Connection conn = DriverManager.getConnection(DbConn.url, "scott", "1111");
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			
			pstmt.setString(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("입력성공");
			} else {
				System.out.println("입력실패");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
