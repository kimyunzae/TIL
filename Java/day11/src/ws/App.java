package ws;

import java.util.ArrayList; 
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start ....");
		
		OracleDAO oracleDao = new OracleDAO();
		DAO dao = oracleDao;
		Search search = oracleDao;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input cmd(i,d,u,s,a,c,q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;

			} else if (cmd.equals("i")) {
				System.out.println("Input Book info  ..");
				System.out.println("Input Book ISBN: ");
				String isbn = sc.next();
				System.out.println("Input Book Name: ");
				String name = sc.next();
				System.out.println("Input Author: ");
				String author = sc.next();

				BookVO c = new BookVO(isbn, name, author);
				try {
					dao.insert(c);
				} catch (DuplicatedIDException e) {
					System.out.println(e.getMessage()); 
				}

			} else if (cmd.equals("d")) {
				System.out.println("Input Book ISBN: ");
				String id = sc.next();
				try {
					dao.delete(id);
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}

			} else if (cmd.equals("u")) {
				System.out.println("Input Book ISBN: ");
				String isbn = sc.next();
				System.out.println("Input Book Name: ");
				String name = sc.next();
				System.out.println("Input Author: ");
				String author = sc.next();

				BookVO c = new BookVO(isbn, name, author);
				try {
					dao.update(c);
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}

			} else if (cmd.equals("s")) {
				System.out.println("Input Book ISBN: ");
				String isbn = sc.next();
				BookVO b;
				try {
					b = dao.select(isbn);
					System.out.println(b);
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			

			} else if (cmd.equals("a")) {
				ArrayList<BookVO> list = null;
				try {
					list = dao.select();
					for (BookVO b : list) {
						System.out.println(b);
					}
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			
				
			} else if (cmd.equals("c")) {
				System.out.println("Input Book Name: ");
				String name = sc.next();
				ArrayList<BookVO> list = null;
				try {
					list = search.search(name);
					for (BookVO b : list) {
						System.out.println(b);
					}
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
				
			}
		}

		sc.close();
		System.out.println("End ....");
	}

}