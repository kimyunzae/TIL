package test;

import java.util.List;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class ItemTest {

	public static void main(String[] args) {
		Dao<Integer, ItemVo> dao = new ItemDao();
		
		ItemVo item = new ItemVo(1111, "Computer", 2500);

		List<ItemVo> list = null;
		
		
		try {
			dao.select(1234);
			
			list = dao.select();
			for (ItemVo itemVo : list) {
				System.out.println(itemVo); 
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}

}
