import java.util.*;

class SumOfSubset
{
	//static int check(int a[], int x)
	//{
	   

	
	//}//
	static void sort (int a[])
	{
	      for(int i=0; i<a.length; i++)
		  {
			  int temp=0;
			  for(int j=0; j<a.length; j++)
			  {
				  if(a[j]>a[j+1])
				  {  temp=a[j+1];
				      a[j+1]=a[j];
					  a[j]=temp;
				  }
			  }
		  }
	}
	
	
	
	public static void main(String...args)
	{
		Scanner s  = new Scanner (System.in);
		int a[] = new int [5];
		System.out.println("enter the size of the array ");
		int size = s.nextInt();
		System.out.println("enter the array element");
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the sum comaprable value");
		int x=s.nextInt();
		sort(a);
		for(int j=0; j<a.length; j++)
		{
			System.out.println(a[j]);
		}
		
	}
}