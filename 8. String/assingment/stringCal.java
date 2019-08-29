import java.io.*;
class stringCal
{
	public static void main(String...args) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String s=b.readLine();
		//System.out.println(s);
		System.out.println("Total number of characters:"+s.length());
		int count =0;
		for(int i=0; i<s.length(); i++)
		{
		  char ch = s.charAt(i);
           if(	ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			count++;
		}
		System.out.println("Number of vowels"+count);
		StringBuilder s1=new StringBuilder(s);
		s1=s1.reverse();
		
		System.out.println("reverse of the String   "+s1);
		System.out.println("reverse of the String   "+s);
		/*
		String rev="";
		for(int i=s.length()-1; i>=0; i++)
		{
			rev =rev + s.charAt();
		}
		System.out.println("reverse of the String   "+rev);
		*/
		
	}
}