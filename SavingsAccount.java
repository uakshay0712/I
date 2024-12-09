package inheretance;

public class SavingsAccount extends BankAccount{
	
	
	public SavingsAccount(String accountNumber, double balance){
		super(accountNumber,balance);
	}
	
	
	public void withdrawn(double amount) {
		 if (getBalance() - amount >= 0) {
	            super.withdrawn(amount);
	        } else {
	            System.out.println("Cannot withdraw " + amount + " from account " + getAccountNumber());
	        }
		 
	    }
	
	    public static void main(String[] args) {
	       
	        BankAccount account = new BankAccount("12345", 1000.0);
	        account.deposit(500.0);
	        account.withdrawn(200.0);
	        System.out.println("Account balance: " + account.getBalance());

	       
	        SavingsAccount savingsAccount = new SavingsAccount("67890", 500.0);
	        savingsAccount.deposit(200.0);
	        savingsAccount.withdrawn(50.0); 
	        System.out.println("Savings account balance: " + savingsAccount.getBalance());
	    }

}
