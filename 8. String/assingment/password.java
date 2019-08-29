import java.io.*;
class password
{
	public static void main(String...args) throws IOException
	{ 
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			StringBuffer s2=new StringBuffer(100);
			
		String s="viren@97321";
		String s1=b.readLine();
		
		
			if(s.equals(s1))
			{
				System.out.println("Correct Password!!!");
				s2.append(s1);
				s2.append("Welcome to java!!!");
			}
			else 
				
	         System.out.println("InCorrect Password!!!");
	         System.out.println(s2);
			 s2.reverse();
			  System.out.println("reverse of the password"+s2);
			  String s4=s2.toString();
			 String s3= s4.replace('!','*');
			
			System.out.println(s3 );
			  
			
			 // System.out.println(s2 );
			 
		
			
			
	}
}