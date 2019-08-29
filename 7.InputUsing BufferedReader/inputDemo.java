import java.io.*;

class inputDemo
{
	public static void main(String...args)throws IOException
	{
		
		int age;
			
		BufferedReader din =new BufferedReader(new InputStreamReader(System.in));	

		System.out.println("enter age");
	    age=Integer.parseInt(din.readLine());
		System.out.println("enter name");
		 String name=din.readLine();
		 	System.out.println("did you ever voted ?????");
		 char ch = (char )din.read();
		 	System.out.println("enter n");
		 
		 
		 if(ch=='Y'||ch=='y'){
			 	System.out.println("badhai ho");
		 }
		 if(ch=='n'||ch=='N')
			 	System.out.println("you welcome");
		System.out.println("age is "+age);
		if(age>=18)
		System.out.println( name+ "is elligible for voting");
	    else 
			System.out.println(name+" is  not elligible for voting");
			
	}
}/**
 import java.io.*;
  InputStreamReader obj=new InputStreamReader(Sysstem.in);
  BufferedReader din= new BufferedReader(obj);
  String name=din.readLine(obj);
  int a=Integer.parseInt(din.reradLine);
  char ch =char din read();
  throws IOException //when you dont provide input the error msg*/