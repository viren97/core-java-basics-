import java.io.*;
class Telcal
{
		 String phno;
    String name;
    int n;//no of call made
    double amt;//amount 
	
	Telcal(String p,String m,int x)
	{
		phno=p;
		name=m;
		n=x;
		
		
	}
  void compute ()
  {
	  if (n>0)
		  amt= 500;
	  else if(n>100)
		  amt=500+(n*1.00);
	  else if(n>200)
		  amt=500+(n*1.20);
	  else
		  amt=500+(n*1.30);
		  
  }
  void display()
  {
	  System.out.println("Amount to be paid ="+amt);
  }
 
  
}
class Bill
{
	 public static void main(String...args)
	{
	
       Telcal t =new Telcal("7879855335","Viren Pandey",300);
          t.compute();
           t.display();		  
	}
}
