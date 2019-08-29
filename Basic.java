import java.io.*;
class Student
{
	//data member
	int sid;
	String sname;
	double percentage;
	//Member function
	Student()
	{
		sid=0;
		sname="No Name";
		percentage=0.0;
	}
	Student(int s,String n,double p)
	{
		sid=s;
		sname=n;
		percentage=p;
	}
	void input()throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader din=new BufferedReader(obj);
        System.out.println("Enter Student Id");		
        sid=Integer.parseInt(din.readLine());	

        System.out.println("Enter Student Name");		
        sname=din.readLine();

       System.out.println("Enter Student Percentage");		
       percentage=Double.parseDouble(din.readLine());	
		
		
	}
	void grade()
	{
		
	}
	void output()
	{
		System.out.println("Student id="+sid);
		System.out.println("Student Name="+sname);
		System.out.println("Student percentage="+percentage);
		System.out.println("********************************");
		
	}
}
class Basic
{
	public static void main(String[] args)
	{
       Student s=new Student();
       Student p=new Student(101,"Amit",90.7);
	   s.output();
	   p.output();
	try
	 {
	   s.input();
	   p.input();
	  }
	catch(Exception ex)	
	{
	System.out.println(ex.getMessage());
	}  	
   s.output();
    p.output();	
	}	 
}






