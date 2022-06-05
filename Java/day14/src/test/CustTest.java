package test;

import java.util.List;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class CustTest {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();
		
		CustVo cust = new CustVo("id77", "pwd77", "이말숙");
		CustVo cust2 = new CustVo("id88", "pwd88", "정말숙");
		CustVo cust3 = new CustVo("id99", "pwd99", "보말죽");
		
		List<CustVo> list = null;
		
		
		try {

			
			System.out.println(cust); 
			dao.delete("id888");
			
			list = dao.select();
			for (CustVo custVo : list) {
				System.out.println(custVo);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
