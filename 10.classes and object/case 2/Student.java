import java.io.*;
class Student
{ BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	//data member
	int sid;
	String sname;
	double percentage;
	//member function
	void input() throws IOException
	{   
	    System.out.println("enter student id ");
		sid=Integer.parseInt(b.readLine());
		System.out.println("enter student name");
		sname=b.readLine();
		System.out.println("enter student percentage ");
		percentage=Double.parseDouble(b.readLine());
		
	}
	void grade()
	{
	}
	void output()
	{
		System.out.println("Student id   "+sid);
		System.out.println("Student name "+sname);
		System.out.println("Student percentage   "+percentage);
		System.out.println("*******************************");
	}
	Student()
	{
		sid = 0;
		sname="none";
		percentage=0.0;
	}
	Student(int a,String n, double d)
	{
		sid=a;
		sname=n;
		percentage=d;
		
	}
}