 class test
{
int value=10;
int data;	
final int item=20;
void display()
{
	System.out.println("Value="+value);
	System.out.println("Data="+data);
	item=40; //This line will generate a compilation error since the variable item is final i.e. its value cannot be changed
	//error: cannot assign a value to final variable item
	System.out.println("Item="+item);
}
}
class MyClass1
{
	public static void main(String args[])
	{
      test t=new test();
      t.display();
	}
}