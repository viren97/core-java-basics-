import java.io.*;
class alphabetical
{
	public static void main(String ... args) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("enter the string");
		System.out.println("all in upper or lower case only");
		String s=b.readLine();
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				for(int j=65; j<=90; j++)
				{
					if(i==ch)
						System.out.println((char)i+"");
				}
			}
			else
			{
				for(int j=97; j<=122; j++)
				{
					if(i==ch)
						System.out.println((char)i+"");
				}
				
			}
		}
		
		
	}
}