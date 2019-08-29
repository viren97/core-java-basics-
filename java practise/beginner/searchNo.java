import java.util.*;
class searchNo
{
	static int search(int a[], int i, int e, int x)
	{
		if(e==-1)
			return -1;
		if(a[i]==x)
			return i;
		if(a[e]==x)
			return e;
		return search(a,i+1,e-1,x);
			
	}

	
	public static void main(String...a)
	{
		Scanner s = new Scanner (System.in);
         int arr[]=new int [5];
		System.out.println("Enter array element");
         for(int i=0; i<arr.length; i++)
				arr[i]=s.nextInt();
	    System.out.println("enter search value");
			int x=s.nextInt();
		int index = search(arr, 0,arr.length-1,x);
		System.out.println("found index is "+index);
	}
}