class Box 
{
	public static void open()
	{
		System.out.println("Box open");
	}
	public void close()
	{
		System.out.println("Box closed");
	}
}
class Door
{
	
	public static void main(String[] args) 
	{
		Box.open();
		Box b1=new Box();
		b1.close();
	}
}

