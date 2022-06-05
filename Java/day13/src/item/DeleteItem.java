package item;

import java.sql.*;

public class DeleteItem {

	public static void main(String[] args) {

		//변수 선언
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "DELETE FROM ITEM WHERE id=?";

		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver Loading...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//MySQL Connect
		String url = "jdbc:mysql://127.0.0.1/shopdb?serverTimezone=Asia/Seoul";
		String mid = "admin1";
		String mpwd = "Luke22240@";

		try {
			con = DriverManager.getConnection(url, mid, mpwd);
			System.out.println("MySQL Server Connected..."); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, 12345);
			int result = ps.executeUpdate();
			System.out.println(result); 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {				
					e.printStackTrace();
				}
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}	
		

	}

}