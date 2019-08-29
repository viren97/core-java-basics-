import java.io.*;
class stringWord
{
	public static void main(String ... args) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the string");
		String s=b.readLine();
	   System.out.println("length of the string is"+s.length());
	

	}
}