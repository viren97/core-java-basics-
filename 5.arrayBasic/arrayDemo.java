import java.util.*;
class arrayDemo
{
	public static void main(String...args)
	{
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		int a[]=new int [5];
		System.out.println("enter array element");
		
		for(i=0; i<5; i++)
			a[i]=s.nextInt();
		for(i=0; i<5; i++)
			sum=sum+a[i];
		System.out.println("sum is"+sum);
		
	}
}