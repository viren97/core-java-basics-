import java.util.*;
class arraysumminmax
{
	public static void main(String...args)
	{
		int i,sum=0,min=9,max=0;
		Scanner s=new Scanner(System.in);
		int a[]=new int [5];
		
		System.out.println("enter the 5 array element");
		for(i=0; i<5; i++)
         a[i]=s.nextInt();
	 for(int n:a)
	 {
		 if(min>n)
			 min=n;
		 if(max<n)
			 max=n;
		 sum=sum+n;
	 }
	 System.out.println("min value among element is"+min);
	 System.out.println("max value among element is "+max);
	 System.out.println("sum of the element is "+sum);
	 
        	 
		
	}
}