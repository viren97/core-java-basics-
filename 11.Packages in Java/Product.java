//creating a package pack with
//Addition.class file
//package is keyword
package pack;
public class Product
{

	
		 double d1;
         double d2;//data member
     public Product(double a,double b)
	 {
		 d1=a;
		 d2=b;
	 }		 
	 public void mul()
	 {
		 double mul;
		 mul=d1*d2;
		 System.out.println("Sum is ="+mul);
	 }
	
}