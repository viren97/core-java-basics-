 class Common
{
	void calculate(double x)
	{
		System.out.println("Square="+(x*x));
	}
}
class MyClass
{
	
	public static void main(String args[])
	{
		Common obj1=new Common();
		Common obj2=new Common();
		Common obj3=new Common();
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);
	}
}