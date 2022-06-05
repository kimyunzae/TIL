package oracle;

public class ItemTestApp {

	public static void main(String[] args) {
		DAO dao = new ItemDAO();
		
		ItemVO item = new ItemVO(100, "Pants", 10000.0);
		try {
			dao.insert(item);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
