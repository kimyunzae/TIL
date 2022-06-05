package dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.ProductVo;


public class ProductDao extends Dao<Integer, ProductVo> {

	@Override
	public void insert(ProductVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.insertProduct);
			ps.setString(1, v.getName());
			ps.setInt(2, v.getPrice());
			ps.setDouble(3, v.getRate());
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally { // 정상적으로 진행되도 close 발생
			close(ps);
			close(con);
		}

	}

	@Override
	public void update(ProductVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.updateProduct);
			ps.setString(1, v.getName());
			ps.setInt(2, v.getPrice());
			ps.setDouble(3, v.getRate());
			ps.setInt(4, v.getId());
			ps.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally { // 정상적으로 진행되도 close 발생
			close(ps);
			close(con);
		}

	}

	@Override
	public void delete(Integer k) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.deleteProduct);
			ps.setInt(1, k);
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally { // 정상적으로 진행되도 close 발생
			close(ps);
			close(con);
		}

	}

	@Override
	public ProductVo select(Integer k) throws Exception {
		ProductVo p = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.selectProduct);
			ps.setInt(1, k);

			rs = ps.executeQuery();
			rs.next(); // 그냥 하셈

			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			Date regdate = rs.getDate("regdate");
			double rate = rs.getDouble("rate");
			
			p = new ProductVo(id, name, price, regdate, rate);

		} catch (Exception e) {
			throw e;
		} finally { // 정상적으로 진행되도 close 발생
			close(ps);
			close(con);
			close(rs);
		}
		return p;
	}

	@Override
	public List<ProductVo> select() throws Exception {
		List<ProductVo> list = new ArrayList<ProductVo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.selectAllProduct);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				Date regdate = rs.getDate("regdate");
				double rate = rs.getDouble("rate");
				ProductVo item = new ProductVo(id, name, price, regdate, rate);
				list.add(item);
			}

		} catch (Exception e) {
			throw e;
		} finally { // 정상적으로 진행되도 close 발생
			close(ps);
			close(con);
			close(rs);
		}

		return list;
	}

}
