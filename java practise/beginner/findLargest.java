import java.util.*;
class findLargest
{
  static int large(int a[])
	{
	 int l=a[0];
      		for(int i=1; i<a.length; i++)
			{
				if(a[i]>=l)
					l=a[i];
				
			}
			return l;
	}
	
	public static void main(String...ard)
	{    
	    Scanner s = new Scanner(System.in);
		int a[]=new int [5];
		for(int i =0; i<a.length; i++)
			a[i]=s.nextInt();
		System.out.println("largest is = "+large(a));
	}
}