package app;

import java.util.List;
import java.util.Scanner;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class App {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();
		
		
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Input cmd(i,s,l,q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
				
			} else if (cmd.equals("i")) {
				System.out.println("Input Customer Info ..");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				CustVo c = new CustVo(id, pwd, name);
				try {
					dao.insert(c);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} else if (cmd.equals("s")) {
				List<CustVo> list = null;
				try {
					list = dao.select();
					for (CustVo custVo : list) {
						System.out.println(custVo);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			} else if (cmd.equals("l")) {
				System.out.println("Input ID PWD");
				String id = sc.next();
				String pwd = sc.next();
				CustVo c = null;
				try {
					c = dao.select(id);	//먼저 id값으로 계정이 있는지부터 확인    
					if(c.getPwd().equals(pwd)) {
						System.out.println("Logged in");	//pwd 비교  
					} else {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("Login Fail...");
				}	
			
			}
		}
		
		
		sc.close();
		System.out.println("End ...");
	}

}