 abstract class Common
{
	abstract void calculate(double x);
    void show()
	{
		System.out.println("Topic:Abstract Class");
	}
	
}
class Sub1 extends Common
{
	void calculate(double x)
	{
		System.out.println("Square="+(x*x));
		show();
		
	}
	
}
class Sub2 extends Common
{
	void calculate(double x)
	{
		System.out.println("Square Root="+Math.sqrt(x));
	}
	
}
class Sub3 extends Common
{
	void calculate(double x)
	{
		System.out.println("Cube="+(x*x*x));
	}
	
}
class MyClass
{
	
	public static void main(String args[])
	{
		Sub1 obj1=new Sub1();
		Sub2 obj2=new Sub2();
		Sub3 obj3=new Sub3();
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);
		
	}
}