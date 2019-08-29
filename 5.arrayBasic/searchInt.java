import java.util.*;
class searchInt
{
	public static void main(String...args)
	{
			int i;
		Scanner s=new Scanner (System.in);
		int a[]=new int[10];
		for(i=0; i<10; i++)
		{
			a[i]=s.nextInt();
		}
		int count=0;
				System.out.println("enter search element");
				int val=s.nextInt();
			
		for(i=0; i<10; i++)
		{
			if (val==a[i])
			{	System.out.println("search successful");
			System.out.println("Element  "+a[i]+"  Position  "+(i+1));
			count++;
			
			}
		
		}
			if(count==0)
			{
				System.out.println("search element not found");
				
			}
		
		
	}
}