 /*
A final variable that is not initialized 
at the time of declaration is known 
as blank final variable. 
We must initialize the blank final variable 
in constructor of the class otherwise 
it will throw a compilation error
*/
class test
{
int value=10;
int data;	
final int item;
test()
{
	item=20;
}
void display()
{
	System.out.println("Value="+value);
	System.out.println("Data="+data);
	System.out.println("Item="+item);
}
}
class MyClass2
{
	public static void main(String args[])
	{
      test t=new test();
      t.display();
	}
}