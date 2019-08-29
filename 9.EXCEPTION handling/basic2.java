
class basic2
{
	public static void main(String...args)  
	{
		int a,b,c;
		try{
			a=10;
		    b=0;
		c=a/b;
		System.out.println("result"+c);
		int arr[]={3,6,7,8,2};
		System.out.println("data at location 4 "+arr[40]);

		
		}
		catch(Exception ex)
		{
			System.out.println("error ocurred"+ex.getMessage());

		}
		finally{
		
				System.out.println("thnku!!!!!");
		}
	}
}