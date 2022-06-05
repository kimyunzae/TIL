package bank;

public class Account {
	private String accNo; // private: 캡슐화
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
			throw new MinusException("마이너스 입니다.");
		}
		this.balance += money;
	}

	public void withdraw(double money) throws MinusException, OverdrawnException {
		if (money < 1) {
		throw new MinusException("마이너스 입니다.");
			
		}
		if (this.balance < money) {
			throw new OverdrawnException("잔액이 부족합니다.");
			
		}
		this.balance -= money;
	}

}
