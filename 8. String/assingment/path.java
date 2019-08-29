import java.io.*;
class path
{
	public static void main(String ... args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="c:/users/admin/pictures/tulip.jpg";
		System.out.println(s);
		int a=s.lastIndexOf('/');
		int b=s.lastIndexOf('.');
		String path =s.substring(0,a);
		String extension_name = s.substring(b+1);
		String file_name=s.substring(a+1,b);
		System.out.println("path = "+path);
		System.out.println("file name =  "+file_name);
		System.out.println("extension = "+extension_name);
	
	}
}