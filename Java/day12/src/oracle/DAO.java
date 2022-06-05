package oracle;

import java.util.ArrayList;

public interface DAO {
	
	public default void connect() {
		System.out.println("Connect .....");	
	}

	public default void close() {
		System.out.println("Close .....");
	}
	
	//CRUD		//미리 인터페이스에서 Exception정의
	public void insert(Object obj) throws Exception;	
	public void delete(Object obj) throws Exception; 			
	public void update(Object obj) throws Exception; 		
	public CustomerVO select(Object obj) throws Exception; 	
	public ArrayList<Object> select() throws Exception; 	
}
