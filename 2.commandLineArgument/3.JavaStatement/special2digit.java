class special2digit
{
	public static void main(String...args)
	{
		int a,sum=0,mul=1,i,temp,re,b;
		a=Integer.parseInt(args[0]);
		
		temp=a;
		while(temp!=0)
		{
			re=temp%10;
			sum=sum+re;
			mul=mul*re;
			temp=temp/10;
		}
		//System.out.println(sum,mul);
		b=sum+mul;
		if(a==b)
		System.out.println("special two digit no.");
        else 
        System.out.println("not special two digit no.");			
	}
	
	
	
	
	
}