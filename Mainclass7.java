class Store
{
	public void sellProduct()
	{
		System.out.println(" Sell the Product");
		Product.displayDetails();

	}
	public void restockProduct()
	{
		System.out.println(" Restock the Product");
	}
	public void checkInventory()
	{
		System.out.println("Check Inventory");
	}
}
class Product
{
	public static void displayDetails()
	{
		System.out.println("Display details");
		Store s1=new Store();
		s1.checkInventory();

	}
	public static void orderProduct()
	{
		System.out.println("Order the product");
		Store s1=new Store();
		s1.restockProduct();
	}
}
class Category
{
	public static void createCategory()
	{
		System.out.println("Create category");
		Store s1=new Store();
		s1.sellProduct();
	}
	public void categorizeProduct()
	{
		System.out.println("Categorize the products");
		Product.orderProduct();
	}
}
class Mainclass7 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts..");
		Store s1=new Store();
		s1.sellProduct();
		Product.orderProduct();
		Category c1=new Category();
		c1.categorizeProduct();
		System.out.println("Main ends..");
	}
}
