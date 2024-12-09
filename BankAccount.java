package inheretance;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {

		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance= balance+amount;
		System.out.println("Deposited "+amount+ " int to "+accountNumber);
	}
	public void withdrawn(double amount) {
		if(amount>=0) {
			balance = balance-amount;
			System.out.println("Withdrawn "+ amount+" from "+ accountNumber);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
}
