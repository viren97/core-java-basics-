package pack;

public class Utility
{
	public double cubeRoot(double a)
	{
		//return (Math.pow(a,3));
		return Math.cbrt(a);
	}
	public double circumferance(int a)
	{
		return (Math.PI*2*a);
	}
	
	public double area(int a)
	{
		return (Math.PI*a*a);
	}
	public int sum(int a,int b)
	{
		return (a+b);
	}
	public int factorial(int a)
	{ int fact=1;
	   for(int i=1; i<=a; i++)
		   fact=fact*i;
	   return fact;
	}
	
}