package oracle;

import java.util.ArrayList;

public class SelectAllTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		ArrayList<CustomerVO> list = null;
		
		try {
			list = dao.select();
		} catch (Exception e) {
			System.out.println(e.getMessage());
 			
		}
		
		
	}
}