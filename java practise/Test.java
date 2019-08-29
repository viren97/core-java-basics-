import java.lang.reflect.method;
import java.lang.reflect.field;
class Test
{
    public static void main(String...a)
	{
		Student s = new Student();
		Class c = s.getClass();
		System.out.println(c.getName());
		Method m[] = c.getDeclaredMethod();
		for(Method method : m)
			System.out.println(method.getName());
		Field f[] = c.getDeclaredField();
		for(Field field : f)
			System.out.println(field);
	}
}
class Student 
{
	int roll;
	String name;
	void getName()
	{}
	void getRoll()
	{}
}
