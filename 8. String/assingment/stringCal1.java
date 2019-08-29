import java.io.*;
class stringCal1
{
	public static void main(String...args)throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String s=b.readLine();
		int upper=0;
		int lower=0;
		int digit=0;
		int special=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
			{
			  upper++;
			}
			else if(Character.isLowerCase(ch))
			{
				lower++;
			}
			else if(Character.isDigit(ch))
			{
				digit++;
			}
			else 
				special++;
			
		}
		double d=upper+lower+digit+special;
		System.out.println("no. of uppercases in string " +upper);
		System.out.println("no. of lowerercases in string " +lower);
		System.out.println("no. of digit in string " +digit);
		System.out.println("no. of special character in string " +special);
		System.out.println("percentage of uppercases in string "+((upper/d)*100));
		System.out.println("percentage of lowercases in string "+((lower/d)*100));
		System.out.println("percentage of lowercases in string "+((digit/d)*100));
		System.out.println("percentage of lowercases in string "+((special/d)*100));
		
	
	}
}