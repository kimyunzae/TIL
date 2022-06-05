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
	public void insert(CustomerVO c) throws DuplicatedIDException;	
	public void delete(String id) throws NotFoundException; 			
	public void update(CustomerVO c) throws NotFoundException; 		
	public CustomerVO select(String id) throws NotFoundException; 	
	public ArrayList<CustomerVO> select() throws NotFoundException; 	
}
