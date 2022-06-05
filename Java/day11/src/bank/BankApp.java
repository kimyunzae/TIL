package bank;

public class BankApp {

	public static void main(String[] args) {
		Account acc = new Account("1111", 10000);
		
		try {
			acc.deposit(-18000);
		} catch (MinusException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(acc);
		
		
		try {
			acc.withdraw(100000);
		} catch (MinusException | OverdrawnException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(acc);
		
	}

}
