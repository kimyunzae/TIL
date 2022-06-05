package bank;

public class Account {
	private String accNo; // private: ĸ��ȭ
	private double balance;

	public Account() {
	}

	public Account(String accNo) {
		this.accNo = accNo;
	}

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}

	public void deposit(double money) throws MinusException {
		if (money < 1) {
			throw new MinusException("���̳ʽ� �Դϴ�.");
		}
		this.balance += money;
	}

	public void withdraw(double money) throws MinusException, OverdrawnException {
		if (money < 1) {
		throw new MinusException("���̳ʽ� �Դϴ�.");
			
		}
		if (this.balance < money) {
			throw new OverdrawnException("�ܾ��� �����մϴ�.");
			
		}
		this.balance -= money;
	}

}
