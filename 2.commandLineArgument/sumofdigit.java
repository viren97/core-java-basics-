class sumofdigit
{
	
	public static void main(String...args)
	{
		int sum=0,a,re,temp;
		a=Integer.parseInt(args[0]);
		temp=a;
		while(temp!=0)
		{
			re=temp%10;
			sum=sum+re;
			temp=temp/10;
			
		}
		System.out.println("sum of the digit="+sum);
	}
}