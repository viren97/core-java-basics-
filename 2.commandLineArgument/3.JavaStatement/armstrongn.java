
class armstrongn
{
	
	public static void main(String...args)
	{
		int a,x=0,result=0,re,b;//b is to store the value of a to find no. of digit
		a=Integer.parseInt(args[0]);
		System.out.println("given no is "+a);
		b=a;
		while(b!=0)
		{
			re =b%10;
			
			b=b/10;
			++x;
				
			
		}
		b=a;
		while(b!=0)
		{
			re =b%10;
			result=result+ (re*re*re);
			b=b/10;
		}
		if(result==a)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
		
		
	}
}