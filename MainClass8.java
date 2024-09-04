class Bank
{
	public void openAccount()
	{
		System.out.println("Open account");
		Account.displayAccountDetails();
	}
	public void closeAccount()
	{
		System.out.println("close account");
	}
	public static void checkBalance()
	{
		System.out.println("Check balance");
		Account.transferFunds();
	}
}
class Account
{
	public static void displayAccountDetails()
	{
		System.out.println("Display account details");
		Bank.checkBalance();
	}
	public static void transferFunds()
	{
		System.out.println("Transfer Funds");
	}
}
class Transaction
{
	public static void logTransaction()
	{
		System.out.println("Log Transaction");
		Bank b1=new Bank();
		b1.openAccount();
	}
	public void processTransaction()
	{
		System.out.println("Process Transaction");
		Bank b1=new Bank();
		b1.closeAccount();
	}
}

class MainClass8
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Transaction.logTransaction();
		Transaction t1=new Transaction();
		t1.processTransaction();
	}
}
