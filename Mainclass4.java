class OnlineTransaction
{
	public static void UPI()
	{
		System.out.println("UPI transaction");
		phonePay();
	}
	public static void phonePay()
	{
		System.out.println("Phone pay Transaction");
	}
}
class OfflineTransaction
{
	public void withDraw()
	{
		System.out.println("with draw amount");
	}
	public void transfer()
	{

		System.out.println("transfer amount");
		withDraw();
	}
}

class Mainclass4 
{
	public static void creditCard()
	{
		System.out.println("Credit card transaction");
		OnlineTransaction.UPI();
	}
	public void debitCard()
	{
		System.out.println("Debit card Transaction");
		OfflineTransaction ot=new OfflineTransaction();
		ot.transfer();
	}
	public static void main(String[] args) 
	{
		creditCard();
		Mainclass4 c1=new Mainclass4();
		c1.debitCard();
	}
}
