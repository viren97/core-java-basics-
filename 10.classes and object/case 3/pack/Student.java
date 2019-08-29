package pack;
import java.io.*;

public class Student
{ BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	//data member
	 private int sid;
	 private String sname;
	 private double percentage;
	//member function
	 public void input() throws IOException
	{   
	    System.out.println("enter student id ");
		sid=Integer.parseInt(b.readLine());
		System.out.println("enter student name");
		sname=b.readLine();
		System.out.println("enter student percentage ");
		percentage=Double.parseDouble(b.readLine());
		
	}
	 public void grade()
	{
	}
	 public void output()
	{
		System.out.println("Student id   "+sid);
		System.out.println("Student name "+sname);
		System.out.println("Student percentage   "+percentage);
		System.out.println("*******************************");
	}
	 public Student()
	{
		sid = 0;
		sname="none";
		percentage=0.0;
	}
	public Student(int a,String n, double d)
	{
		sid=a;
		sname=n;
		percentage=d;
		
	}
}