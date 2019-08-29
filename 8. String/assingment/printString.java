import java.io.*;
class printString
{
	public static void main(String ... args) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer s=new StringBuffer(100);
		String s1="WelComE TO School";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.print(Character.toLowerCase(ch));
			}
			else
				
			System.out.print(Character.toUpperCase(ch));
		}
		
	}
}