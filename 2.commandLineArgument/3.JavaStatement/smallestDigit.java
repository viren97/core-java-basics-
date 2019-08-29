class smallestDigit
{
	public static void main(String...args)
	{
		int a,b,re,min=9;
		a=Integer.parseInt(args[0]);
		b=a;
		while(a!=0)
		{	re=a%10;
			if(min>re)
				min=re;
			a/=10;
		}
System.out.println("Input is "+b);		
System.out.println("Smallest digit is "+min);		
		
	}
}