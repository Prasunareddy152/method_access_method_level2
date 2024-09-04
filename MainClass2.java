class  Mobile
{
	public  void storePower() 
	{
		System.out.println("store power");
	}
}
class  Charger
{
	public  void providePower() 
	{
		System.out.println("provide power");
	}
}
class  MainClass2
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Mobile m1=new Mobile();
		m1.storePower();
		Charger c1=new Charger();
		c1.providePower();
		System.out.println("main ends");
	}
}
