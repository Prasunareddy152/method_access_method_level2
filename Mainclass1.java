class Train 
{
	public static void carry()
	{
		System.out.println("carrying ");
	}
	public static void move()
	{
		System.out.println("Moving");
	}
}
class Station
{
	public static void give()
	{
		Train.carry();
		Train.move();
	}
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		Station.give();
	}
}
