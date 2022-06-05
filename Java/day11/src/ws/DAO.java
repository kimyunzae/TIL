package ws;

import java.util.ArrayList;

public interface DAO {

	public void insert(BookVO b) throws DuplicatedIDException;	
	public void delete(String isbn) throws NotFoundException; 	
	public void update(BookVO b) throws NotFoundException; 	
	public BookVO select(String isbn) throws NotFoundException; 	
	public ArrayList<BookVO> select() throws NotFoundException;

	
	
}
