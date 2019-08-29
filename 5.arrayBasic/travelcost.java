import java.util.*;
class travelcost
{
	public static void main(String... args)
	{
		//ta-ticjet amount
		double netAmount;
		double discount;
		
	    Scanner s=new Scanner(System.in);
		String name[]=new String [5];
		double ta[]=new double [5];
		for(int i=0; i<5; i++)
		{
			System.out.println("enter the name of the costmer");
			name[i]=s.next();
			System.out.println("enter the amount to be paid");
			ta[i]=s.nextInt();
		}
		//discount and net amount to be paid 
		System.out.println("SI.No\t Name\t Ticket charges\t\tDiscount\t Net Amount");
		int c=1;
	    for(int i=0; i<5; i++)
		{    
			if(ta[i]>70000)
			{ discount= ta[i]*(.18);
			 netAmount= ta[i]-discount;
			System.out.println(+c+"\t"+name[i]+"\t\t"+ta[i]+"\t\t"+discount+"\t\t"+netAmount);
			
			  
			}
		    else if(ta[i]>=55001)
			{ discount= ta[i]*(.16);
			netAmount= ta[i]-discount;
					System.out.println(+c+"\t"+name[i]+"\t\t"+ta[i]+"\t\t"+discount+"\t\t"+netAmount);
			  
			}
			else if(ta[i] >=35001)
			{
		     discount= ta[i]*(.12);
			 netAmount= ta[i]-discount;
		System.out.println(+c+"\t"+name[i]+"\t\t"+ta[i]+"\t\t"+discount+"\t\t"+netAmount);
			}
			else if(ta[i]>=25001) 
			{
			   discount= ta[i]*(.10);
			 netAmount= ta[i]-discount;	
		System.out.println(+c+"\t"+name[i]+"\t\t"+ta[i]+"\t\t"+discount+"\t\t"+netAmount);
			  
			}
			else 
			{
			 discount= ta[i]*(.02);
			 netAmount= ta[i]-discount;
			 System.out.println(+c+"\t"+name[i]+"\t\t"+ta[i]+"\t\t"+discount+"\t\t"+netAmount);
			}
			c++;
			
					
		}
		
	}
}