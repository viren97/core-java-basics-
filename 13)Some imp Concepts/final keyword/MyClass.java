 class test
{
int value=10;
int data;	
final int item=20;
void display()
{
	System.out.println("Value="+value);
	System.out.println("Data="+data);
	System.out.println("Item="+item);
}
}
class MyClass
{
	public static void main(String args[])
	{
      test t=new test();
      t.display();
	}
}