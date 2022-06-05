package ws;

public class Test {

	public static void main(String[] args) {
		OracleDAO oracleDao = new OracleDAO();
		DAO dao = oracleDao;
		Search search = oracleDao;

		BookVO b1 = new BookVO("m1234", "Hatchet", "Jamie");
		BookVO b2 = new BookVO("m2345", "The Young Prince", "Steven");
		BookVO b3 = new BookVO("m3456", "Harry Potter", "Caroline");
		
		try {
			dao.insert(b1);
			dao.insert(b2);
			dao.insert(b3); 
			
			dao.delete(b2.getIsbn());	
			
			BookVO sc = dao.select("m3456");
			System.out.println(sc);
			
			System.out.println(dao.select());
			System.out.println(search.search("The Young Prince"));
			
			
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
