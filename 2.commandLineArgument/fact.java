class fact 
{
	
	public static void main(String []args)
	{
	double a,fact=1;
	a=Double.parseDouble(args[0]);
	for(int i=1; i<=a; i++)
		fact=i*fact;
	System.out.println("factorial of is " +fact);
	
	}		
}