 interface test
{
//By default fields of interface are public,static,final	
int data=300;
//By default methods of interface are public,abstract
void show();
void display();
void input();
}
class MyClass implements test
{
public void show()
{
	System.out.println("Feasible Technologies");
	System.out.println("Data ="+data);
}	
public void display()
{
	
}
public void input()
{
	
}
	
	public static void main(String args[])
	{
    MyClass obj=new MyClass();
    obj.show();


	}
}