
class basic1
{
	public static void main(String...args)  
	{
		int a,b,c;
		try{
			a=10;
		    b=9;
		c=a/b;
		System.out.println("result"+c);
		int arr[]={3,6,7,8,2};
		System.out.println("data at location 4 "+arr[40]);
//it throw error to catch according to error
		
		}
		catch(ArithmeticException ex)
		{
			System.out.println("error ocurred"+ex.getMessage());
			//if type of error ocurred which defined the block will run then goes to finally

		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("error ocurred"+ex.getMessage());
		}
		finally
		{
			System.out.println("thnku!!!!!");//this will run in any case
		}
				
	}
}