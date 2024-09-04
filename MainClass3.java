class Author 
{
	public static void writeStory() 
	{
		System.out.println("write story page by page");
	}
	public static void  reviewPage()
	{
		System.out.println("review story page by page");
	}
}
class Book 
{
	public static void holdStory() 
	{
		System.out.println("hold story book");
		Author.writeStory();
	}
	public static void navigatePage()
	{
		System.out.println("naviagte page to page");
		Author.reviewPage();
	}
}
class MainClass3
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Book.holdStory();
		Book.navigatePage();
		System.out.println("main ends");
	}
}