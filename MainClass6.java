class Library
{
	public void borrowBook()
	{
		System.out.println("Borrow book");
		Book.displayDetails();
	}
	public void returnBook()
	{
		System.out.println("Return book");
	}
	public void checkAvailability()
	{
		System.out.println("check avialability");
	}
}
class Book
{
	public static void displayDetails()
	{
		System.out.println("Display books");
		Library l1=new Library();
		l1.checkAvailability();
	}
	public void reserveBook()
	{
		System.out.println("Reserve book");
		Library l1=new Library();
		l1.returnBook();
	}
}
class MainClass6 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method starts..");
		Library l1=new Library();
		l1.borrowBook();
		Book b1=new Book();
		b1.reserveBook();
		System.out.println("Main method ends..");
	}
}
