class threadclass extends Thread
{
	public void run ()
	{   int n=10;
		while(n>0)
		{System.out.println(n);
			n--;
		try{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	    }
		
	}
	
	public static void main(String ... args)
	{
		threadclass t1 = new threadclass();
		threadclass t2 = new threadclass();
		
		t1.start();
		t2.start();
	}
}