import java.io.*;
class InputDemo
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader din=new BufferedReader(obj);
	
     	System.out.println("Enter Your Name");
		String name=din.readLine();
		
		System.out.println("Enter your Age");
		int age=Integer.parseInt(din.readLine());
	
    	if(age>=18)
		{
			System.out.println("Dear "+name+" You are Eligible");
			System.out.println("Did You Ever voted Before?? Press Y/N");
			char ch=(char)din.read();
			if(ch=='Y')
			{
				System.out.println("Congratulations!!!");
			}
			if(ch=='N')
			{
				System.out.println("Welcome!!!");
			}
		}
		else
		{
			System.out.println("Dear "+name+" You are Not Eligible");
		}
	}
	
}