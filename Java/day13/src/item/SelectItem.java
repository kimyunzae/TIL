package item;

import java.sql.*;

public class SelectItem {

	public static void main(String[] args) {

		//변수 선언
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM ITEM WHERE id=?";

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
			ps.setInt(1, 1234);
			rs = ps.executeQuery();	//
			rs.next();
			
			int id = rs.getInt("id");
			String name = rs.getString("name");
			float price = rs.getFloat("price");
			
			System.out.println(id + " " + name + " " + price); 
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
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