package test;

import java.util.List;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class ProductTest {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();

		ProductVo p = new ProductVo(1, "CargoPants", 50000, 5.5);

		List<ProductVo> list = null;
		try {
			dao.update(p);

			list = dao.select();
			for (ProductVo productVo : list) {
				System.out.println(productVo);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
