class Title
{
	public static void main(String ... args) 
	{
		
		int len=args.length;
		String s;
		char ch;
           System.out.println(len);
         for(int i=0; i<len; i++)

		{
			if((len-1)==i)
			{
				for(int j=0; j<; j++)
					ch=charAt(j);
				   Character.toUpperCase(ch);
				 System.out.print(ch);  
			}
			else
			{
				for(int k=0; k<len; k++)
					 s=args[i].substring(0,1);
				   Character.toUpperCase(s);
				System.out.print(+s+".");
			}
		 }			 
	}
}