class Player 
{
	public static void play() 
	{
		System.out.println("play");
	}
}
class Volleyball
{
	public static void move()
	{
		System.out.println("move");
	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Player.play();
		Volleyball.move();
		System.out.println("main ends");
	}
}