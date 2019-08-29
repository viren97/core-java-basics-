import java.util.Scanner;
class incomeTax
{
	
	public static void main(String...args)
	{
		int age;
        float ti;//taxable income
		String s;
		
		Scanner in = new Scanner(System.in);
		 System.out.println("enter gender of person\n");
		 s= in.nextLine();
	
			 System.out.println("enter age");
			 age=in.nextInt();
		     System.out.println("enter income"); 
		     ti=in.nextFloat();
		 if(age>65 )
			  System.out.println("wrong category");
		 else if(s.equals("female") )
			  System.out.println("wrong category");
		  else if( age <65 && ti<=160000)
			  System.out.println("nil");
		  else if (age <65 && (ti >160000 ||ti<=500000))
		  {
			  ti=(ti-160000)*(10/100);
			  System.out.println("tax is"+ti);
		  }
		  else if(age <65  &&( ti>500000 || ti<=800000))
		  {
			    ti=((ti-160000)*(20/100))+34000;
			  System.out.println("tax is"+ti);
		  }
		
          else if (age <65 && ti>800000)
		{
			   ti=((ti-160000)*(30/100))+94000;
			  System.out.println("tax is"+ti);
		  }			  
			 
		
		
	}
	
	
}