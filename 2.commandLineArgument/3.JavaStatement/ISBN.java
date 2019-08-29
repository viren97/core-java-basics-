class ISBN
{
	public static void main(String...args)
	{
		int re,mul=1,sum=0,a;
		a=Integer.parseInt(args[0]);
		int temp=a;
		
		for (int i=10; i>=1; i--)
		{
			re=temp%10;
			System.out.println(re);
			mul=re*i;
			
			sum+=mul;
			System.out.println(sum);
			temp/=10;
		}
		System.out.println(a);
		System.out.println(sum);
		if(sum%11==0)
			System.out.println("ISBN is legal");
		else
			System.out.println("ISBN is illegal");
	}		
	
}