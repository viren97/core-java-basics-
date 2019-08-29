import java.io.*;
class stringBufferDemo
{
	public static void main(String...args) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer(100);
		System.out.println("enter first name");
		String first = b.readLine();
			System.out.println("enter middle name");
		String mid = b.readLine();
			System.out.println("enter last name");
		String sur = b.readLine();
		
		
		//append sb in content with sur
		sb.append(sur);
			System.out.println(sb);
		sb.append(first);
			System.out.println(sb);
		sb.append(sur);
			System.out.println(sb);
				sb.reverse();
					System.out.println(sb);
			sb.reverse();
					System.out.println(sb);
		sb.insert(sur.length(),"hero");
			System.out.println(sb);
		
		
		
	}
}