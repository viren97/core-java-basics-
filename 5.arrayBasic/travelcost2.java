import java.lang.Object;
import java.util.*;
class travelcost2
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
		int c=1,i=0;
	    for(double n:ta)
		{    
			if(n>70000)
			{ discount= n*(.18);
			 netAmount= n-discount;
			System.out.println(+c+"     "+name[i]+"     "+n+"     "+discount+"      "+netAmount);
			
			  
			}
		    else if(n>=55001)
			{ discount= n*(.16);
			netAmount= n-discount;
					System.out.println(+c+"\t"+name[i]+"\t\t"+n+"\t\t"+discount+"\t\t"+netAmount);
			  
			}
			else if(n >=35001)
			{
		     discount= n*(.12);
			 netAmount= n-discount;
		System.out.println(+c+"\t"+name[i]+"\t\t"+n+"\t\t"+discount+"\t\t"+netAmount);
			}
			else if(n>=25001) 
			{
			   discount= n*(.10);
			 netAmount= n-discount;	
		System.out.println(+c+"\t"+name[i]+"\t\t"+n+"\t\t"+discount+"\t\t"+netAmount);
			  
			}
			else 
			{
			 discount= n*(.02);
			 netAmount= n-discount;
			 System.out.println(+c+"\t"+name[i]+"\t\t"+n+"\t\t"+discount+"\t\t"+netAmount);
			}
			c++;
			i++;
			
					
		}
		
	}
}