//import java.lang.*;
class stringDemo
{
	public static void main(String...args)
	{
		String s1="feasible";
		String s2 =new String ("Research & technology");
		char arr[]={'P','V','T','L','T','D'};
		String s3=new String (arr);
		String s4=new String("feasible");
		String s5="feasible";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(Integer.toHexString(System.identityHashCode(s1)));
		System.out.println(Integer.toHexString(System.identityHashCode(s2)));
		System.out.println(Integer.toHexString(System.identityHashCode(s3)));
		System.out.println(Integer.toHexString(System.identityHashCode(s4)));
		System.out.println(Integer.toHexString(System.identityHashCode(s5)));
		if(s1==s4)
			System.out.println("1.string are equal");
		if(s1==s5)
			System.out.println("2.string are equal");
		if(s1.equals(s4))
			System.out.println("3.string are equal");
		if(s1.equals(s5))
			System.out.println("4.string are equal");
		
		//to find string length
	  System.out.println("string length ="+s1.length());
	    //if u dont want to put upper bound
		int a[]={2,3,4,6,7,7};
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		//to merge to string
		String s=s1.concat(s2);
	 System.out.println("string after concatenate="+s1.concat(s2));
	 System.out.println("string after concatenate="+s1.concat(s3));
	 System.out.println("string after concatenate="+s1.concat(s2+s3));
	 System.out.println("string after concatenate="+s.concat(s3));
	 System.out.println("string after concatenate="+s1+s2+s3);
	 
	 boolean x=s1.startsWith("f");//there is only 2 op true and false not 0 and 1
	 if(x==true)
	 {
				System.out.println("string strat withh f");	 
	 }
	 else
		 			System.out.println("string not start with f");
				 if(x)
	 {
				System.out.println("string strat withh f");	 
	 }
				
		//element at particular index
				System.out.println("at index 4"+s1.charAt(4));
        //to find index no of sub-string				
	 int n=s2.indexOf("tech");//if it store in that variable
						System.out.println("index no of tech"+n);
	 //upper or lower case
	 
			System.out.println(" s1 in upper case"+s1.toUpperCase());	 
			System.out.println(" s1 in upper case"+s1.toLowerCase());	 
			
     //sub-string
	 System.out.println(" s1 substring from 2 to 4   "+s1.substring(2,4));	 
	 System.out.println(" s1 substring from 0 to 5   "+s1.substring(0,5));	 
	 System.out.println(" s1 substring from 3        "+s1.substring(3));	 
	    
       	 
		
	}
}