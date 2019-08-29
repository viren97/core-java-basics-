import pack.Addition;
import pack.Subtract;
import pack.Product;
import pack.Division;
class Use
{
	public static void main(String...args) 
	{
		Addition a=new Addition(90.8,48.9);
		a.sum();
		Subtract s=new Subtract(7.8,6.9);
		s.sub();
		Product p =new Product (14,78);
		p.mul();
		Division d=new Division(15,16);
		d.div();
		     
	}
}