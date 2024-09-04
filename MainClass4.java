class  Circle
{
	public  void  calculateArea()
	{
		System.out.println("calculate Area");	
	}
	public  void  calculateCircumference()
	{
		System.out.println("calculate circumference");
		Calculator.findCube();
	}
}
class  Calculator
{
	public static void findSquare()
	{
		System.out.println("find square");
		Circle c1=new Circle();
		c1.calculateArea();
	}
	public static void findCube()
	{
		System.out.println("find cube");
	}
}
class  MainClass4
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Calculator.findSquare();
		Circle c1=new Circle();
		c1.calculateCircumference();
		System.out.println("main ends");
	}
}