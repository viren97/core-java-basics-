
class Basic
{
	public static void main(String ... args) 
	{
		Student s=new Student();
		Student p=new Student(101,"viren",90.7);
		
		s.output();
		p.output();
	try
	{	s.input();
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