import java.io.*;
class ThrowDemo
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader din=new BufferedReader(obj);
	
     	System.out.println("Enter your Age");
		int age=Integer.parseInt(din.readLine());
	
    try
	{
     	if(age>=18)
		{
			System.out.println("You are Eligible");
			
		}
		else
		{
			throw new ArithmeticException();
		}
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Invalid Age");
	}
	
	
	}
	
}