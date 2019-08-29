 class test
{
	//Data Members
	byte b;    // 1 Byte Memory Size 
	short s;	// 2 Byte Memory Size
	int myint;   // 4 Byte Memory Size
	long l;      // 8 Byte Memory Size
	char mychar; // 2 Byte Memory Size
	float myfloat; // 4 Byte Memory Size
	double mydouble; // 8 Byte Memory Size
	boolean myboolean; // Not Defined
	String mystring;

	
	//Member functions or Methods
void showinitializevalues()
{
	
System.out.println("Byte Integer Value="+ b);  //Default Value 0
System.out.println("Short Integer Value="+ s);//Default Value 0
System.out.println("Integer Value="+ myint);//Default Value 0
System.out.println("Long Integer Value="+ l);//Default Value 0
System.out.println("Char Value="+ mychar);//Default Value '\u0000'  (null in unicode)
//'\u0000' is the unicode value, that in CHAR is equivalent to NULL, ie it is the NULL CHARACTER, rather than being the literal NULL(for strings)
System.out.println("float Value="+ myfloat); //Default Value 0.0
System.out.println("double Value="+ mydouble); //Default Value 0.0
System.out.println("boolean Value="+ myboolean); //Default Value false
System.out.println("String Value="+ mystring); //Default Value null
}
	
}
class MyClass
{
	public static void main(String args[])
	{
      test t=new test();
	  t.showinitializevalues();
	}
}