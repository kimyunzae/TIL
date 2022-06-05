package dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.ItemVo;
 
public class ItemDao extends Dao<Integer, ItemVo> {

	@Override
	public void insert(ItemVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.insertItem);
			ps.setInt(1, v.getId());
			ps.setString(2, v.getName());
			ps.setDouble(3, v.getPrice());
			ps.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally { // 정상적으로 진행되도 close 발생
			close(ps);
			close(con);
		}

	}

	@Override
	public void update(ItemVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.updateItem);
			ps.setDouble(1, v.getPrice());
			ps.setString(2, v.getName());
			ps.setInt(3, v.getId());
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
			ps = con.prepareStatement(Sql.deleteItem);
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
	public ItemVo select(Integer k) throws Exception {
		ItemVo item = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.selectItem);
			ps.setInt(1, k);

			rs = ps.executeQuery();
			rs.next(); // 그냥 하셈

			int id = rs.getInt("id");
			String name = rs.getString("name");
			double price = rs.getDouble("price");
			System.out.println(id + " " + name + " " + price); // 확인용

			item = new ItemVo(id, name, price);

		} catch (Exception e) {
			throw e;
		} finally { // 정상적으로 진행되도 close 발생
			close(ps);
			close(con);
			close(rs);
		}
		return item;
	}

	@Override
	public List<ItemVo> select() throws Exception {
		List<ItemVo> list = new ArrayList<ItemVo>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = getConnection(); // 상위클래스에서 불러옴 Dao.java
			ps = con.prepareStatement(Sql.selectAllItem);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				ItemVo item = new ItemVo(id, name, price);
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
