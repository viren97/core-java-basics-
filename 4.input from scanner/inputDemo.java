import java.util.*;
class inputDemo
{
	public static void main(String...args)
	{
		
		int age;
			
			
		Scanner s =new Scanner(System.in);
		System.out.println("enter age");
	    age=s.nextInt();
		System.out.println("enter name");
		 String name=s.next();
		System.out.println("age is "+age);
		if(age>=18)
		System.out.println( name+ "is elligible for voting");
	    else 
			System.out.println(name+" is  not elligible for voting");
	}
}