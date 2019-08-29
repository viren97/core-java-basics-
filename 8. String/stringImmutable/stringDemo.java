/* String class is immutable ie we cant change the content of string class 
jvm create new add and cut the link bw content and String object..

to resolve ethis problem ther is another class called StringBuffer.
this StringBuffer class can be mutable*/
class stringDemo
{
	public static void main(String...args)
	{
		String s1="feasible";
		String s2 =new String ("Research & technology");
		String s4=new String("feasible");
		String s5="feasible";
		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(Integer.toHexString(System.identityHashCode(s1)));
		System.out.println(Integer.toHexString(System.identityHashCode(s2)));
		//System.out.println(Integer.toHexString(System.identityHashCode(s3)));
		System.out.println(Integer.toHexString(System.identityHashCode(s4)));
		System.out.println(Integer.toHexString(System.identityHashCode(s5)));
		s1=s1+s2;
		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(Integer.toHexString(System.identityHashCode(s1)));
		System.out.println(Integer.toHexString(System.identityHashCode(s2)));
		//System.out.println(Integer.toHexString(System.identityHashCode(s3)));
		System.out.println(Integer.toHexString(System.identityHashCode(s4)));
		System.out.println(Integer.toHexString(System.identityHashCode(s5)));
		
	}
}