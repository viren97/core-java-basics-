import java.io.*;
class formatename
{
	public static void main(String...args) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first name");
		
		String first= b.readLine();
			System.out.println("enter the middle name");
       String mid=b.readLine();	   
			System.out.println("enter the last name");
			String sur=b.readLine();
			
			StringBuffer s=new StringBuffer(100);
			
			s.append(first+"");
			
			s.append(mid);
			
			s.append(sur);
			s.delete(sur.length(),)
				/*System.out.println("after append "+s);
				s.insert(0,sur);
				s.delete(mid.length(),sur.length());*/
				
					System.out.println("after formate "+s);
		
		
	}
}