//creating a package pack with
//Addition.class file
//package is keyword
package pack;
public class Addition
{

	
		 double d1;
         double d2;//data member
     public Addition(double a,double b)
	 {
		 d1=a;
		 d2=b;
	 }		 
	 public void sum()
	 {
		 double sum;
		 sum=d1+d2;
		 System.out.println("Sum is ="+sum);
	 }
	
}