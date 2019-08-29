import java.util.*;
class telephonedir
{
	public static void main(String...args)
	{
		Scanner s=new Scanner(System.in);
		String name[]= new String[5];
		String tele[]=new String[5];
		for(int i=0; i<5; i++)
		{
			System.out.println("enter the name ");
			name[i]=s.next();
			System.out.println("enter the telephone no.");
			tele[i]=s.next();
		}
		System.out.println("enter the seach name");
		String v= s.next();
		int count=0;
		for(int i=0; i<5; i++)
		{
			if(name[i].equals(v))
			{System.out.println("Search Successful");
		     System.out.println("name is  "+name[i]+"  telephone no. is  "+tele[i]);
		       count++;
		      
			} 			
		}
		if(count==0)
		System.out.println("Search unSuccessful : Name not enlisted");
	
	}
}