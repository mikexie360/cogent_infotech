package ExceptionHandling;

public class BankAccount {
	int accNo;
	String custName;
	String accType; // Savings or Current
	float balance;
	
	public BankAccount(){
		super();
	}
	
	public BankAccount(int accNo, String custName, String accType, float balance) throws LowBalanceException, NegativeAmount{
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
		if (balance < 0) {
			throw new NegativeAmount("Balance is negative");
		}
		if (accType.equals("Savings") && balance <1000) {
			throw new LowBalanceException("Savings is too low");
		}
		if (accType.equals("Current") && balance < 5000) {
			throw new LowBalanceException("Current is too low");
		}

	}
	
	public void deposit(float amt) throws NegativeAmount{
		if(amt < 0) {
			throw new NegativeAmount("Deposit Amount is negative");
		}
		balance += amt;
	}
	
	public void withdraw(float amt) throws InsufficientFunds, NegativeAmount{
		if((amt) <0) {
			throw new NegativeAmount("Cant withdraw into negative balance");
		}
		if (accType.equals("Savings") && (balance-amt) <=1000) {
			throw new InsufficientFunds("Not enough in savings");
		}
		if (accType.equals("Current") && (balance-amt) <=5000) {
			throw new InsufficientFunds("Not enough in Current");
		}
		
		balance = balance - amt;
	}
	
	public float getBalance() throws LowBalanceException {
		if (accType.equals("Savings") && (balance) <=1000.0f) {
			throw new LowBalanceException("Savings amount is low: "+ balance);
		}
		if (accType.equals("Current") && (balance) <=5000) {
			throw new LowBalanceException("Current amount is low "+ balance);
		}
		return balance;
	}
	
	
}
