import pack.Utility;
import java.io.*;

class Test
{ 
  public static void main(String...args) throws IOException
  {
	  Utility u=new Utility();
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  int c;
  do
  {
  System.out.println("Enter 1 if you want to calculate cuberoot");
  System.out.println("Enter 2 if you want to calculate circumferance");
  System.out.println("Enter 3 if you want to calculate area");
  System.out.println("Enter 4 if you want to calculate sum");
  System.out.println("Enter 5 if you want to calculate factorial");
  System.out.println("Enter 6 if you want to Exit");
 
  c=Integer.parseInt(b.readLine());

 	 switch (c)
  {   
	  case 1:
	  {
		  System.out.println("Enter no. to calculate cube");
		  double  o=Integer.parseInt(b.readLine());
		  
		  double d=u.cubeRoot(o);
         System.out.println("cubeRoot =" +d);
		  break;
		  }
	 
	 case 2:
	  {
		  System.out.println("Enter radius to calculate circumferance");
		  int  e=Integer.parseInt(b.readLine());
		  
		  double f=u.circumferance(e);
         System.out.println("cubeRoot =" +f);
          break;		  
	  }
	   case 3:
	  {
		  System.out.println("Enter radius to calculate Area");
		  int  g=Integer.parseInt(b.readLine());
		  
		  double h=u.area(g);
         System.out.println("cubeRoot =" +h);
		  
	    break;
	  }  
	    case 4:
	  {
		  System.out.println("Enter two no. to calculate sum");
		  int  i=Integer.parseInt(b.readLine());
		  int  j=Integer.parseInt(b.readLine());
		  
		  double k=u.sum(i,j);
         System.out.println("cubeRoot =" +k);
		  
	  break;
	  }
	  case 5:
	  {
		  System.out.println("Enter a no.  to calculate factorial");
		  int  l=Integer.parseInt(b.readLine());
		  
		  double m=u.factorial(l);
         System.out.println("cubeRoot =" +m);
		  
	  break;
	  } 
	    case 6:
	  {
		  System.exit(0);
		  
	  
	  }
	
	
  }
  }while(c!=6);
  }
	
}