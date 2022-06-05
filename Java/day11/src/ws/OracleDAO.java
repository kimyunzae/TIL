package ws;

import java.util.ArrayList;   
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class OracleDAO implements DAO, Search {

	HashMap<String, BookVO> map;

	public OracleDAO() {
		map = new HashMap<String, BookVO>();
	}

	@Override
	public void insert(BookVO b) throws DuplicatedIDException {
		if(map.containsKey(b.getIsbn())) {
			throw new DuplicatedIDException("The book is already inserted.");
		}
		map.put(b.getIsbn(), b); 
		System.out.println("Inserted");
	}

	@Override
	public void delete(String isbn) throws NotFoundException {
		if(!map.containsKey(isbn)) {
			throw new NotFoundException("The book does not exist.");
		}
		map.remove(isbn);
		System.out.println("Deleted");
	}

	@Override
	public void update(BookVO b) throws NotFoundException {
		if(!map.containsKey(b.getIsbn())) {
			throw new NotFoundException("The book does not exist.");
		}
		map.put(b.getIsbn(), b);
		System.out.println("Updated");
	}

	@Override
	public BookVO select(String isbn) throws NotFoundException {
		BookVO b = null;
		if(!map.containsKey(isbn)) {
			throw new NotFoundException("The book does not exist.");
		}
		b = map.get(isbn);
		return b;
	}

	@Override
	public ArrayList<BookVO> select() throws NotFoundException {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		
		if(map.size()==0) {
			throw new NotFoundException("No data");
		}
		
		Collection<BookVO> col = map.values();
		Iterator<BookVO> it = col.iterator();

		while (it.hasNext()) {
			BookVO cust = it.next();
			list.add(cust);
		}
		return list;
	}

	@Override
	public ArrayList<BookVO> search(String name) throws NotFoundException {
		
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		
		Collection<BookVO> col = map.values();
		Iterator<BookVO> it = col.iterator();
		
		while (it.hasNext()) {
			BookVO book = it.next();
			if (book.getName().equals(name)) {
				list.add(book);
			} else {
				throw new NotFoundException("The book does not exist.");
			}
		
		}
		return list;

	}
}
