package oracle;

public class DeleteTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();

		CustomerVO c1 = new CustomerVO("id01", "pwd01", "Lee");
		CustomerVO c2 = new CustomerVO("id02", "pwd02", "Park");
		
		try {
			dao.insert(c1);
			System.out.println("Inserted..");
			dao.insert(c1); 
			System.out.println("Inserted..");
			
			dao.delete(c1.getId());
			System.out.println("Deleted..");
			dao.delete(c1.getId());
			System.out.println("Deleted..");
			
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());

		}
		
	
			
		
			
		
		 

	}
}