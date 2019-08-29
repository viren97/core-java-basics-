class strong
{
	
	public static void main(String[] args)
	{
		
		int sum=0,fact,a,re,temp;
		a=Integer.parseInt(args[0]);
		temp=a;
		while(temp!=0)
		{    fact=1;
			re=temp%10;
			for(int i=1; i<=re; i++)
			{	fact=fact*i;}
		sum=sum+fact;
			temp=temp/10;
			
		}
			
		System.out.println(sum);
		
		if(sum==a)
		System.out.println("no. is  strong");	
	    else
	    System.out.println("no. is not strong");	
	}
}