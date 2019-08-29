import java.util.*;
class resultClass
{
	public static void main(String...args)
	{
		Scanner s=new Scanner (System.in);
		int roll[]=new int[50];
		int sub1[]=new int [50];
		int sub2[]=new int [50];
		int sub3[]=new int [50];
		int avg[]=new int [50];
		for(int i=0; i<50; i++)
		{
			System.out.println("enter the Roll No.");
			roll[i]=s.nextInt();
			System.out.println("enter the subject A number");
			sub1[i]=s.nextInt();
			System.out.println("enter the subject B number");
			sub2[i]=s.nextInt();
			System.out.println("enter the subject C number");
			sub3[i]=s.nextInt();
		}
			System.out.println("marks obtained by student");
	     System.out.println("Roll no.\tsubject A\tsubject B\tSubject C\taverage");
		for(int i=0; i<50; i++)
		{    avg[i]=(sub1[i]+sub2[i]+sub3[i])/3;
			System.out.println(+roll[i]+"\t\t"+sub1[i]+"\t\t"+sub2[i]+"\t\t"+sub3[i]+"\t\t"+((sub1[i]+sub2[i]+sub3[i])/3));
		}
	   System.out.println("Student who got above 80 average marks");
	    System.out.println("Roll no.\taverage");
		for(int i=0; i<50; i++)
		{
			if(avg[i]>80)
				System.out.println(+roll[i]+"\t\t"+avg[i]);
		}
		 System.out.println("Student who got below 40 average marks");
	    System.out.println("Roll no.\taverage");
		for(int i=0; i<2; i++)
		{
			if(avg[i]<40)
				System.out.println(+roll[i]+"\t\t"+avg[i]);
		}
		
		
	}
	
}