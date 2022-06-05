package p345;

import java.util.ArrayList;

public interface DAO {
	static final int a = 1000;
	
	public default void connect() {
		System.out.println("Connect .....");
	}
	public default void close() {
		System.out.println(" .....");
	}
	
	public void insert(CustomerVO c);
	public void delete(String id);
	public CustomerVO select(String id);
	public ArrayList<CustomerVO> select();
}