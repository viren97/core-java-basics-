import java.util.*;
class produceR
{
	public static void main(String...args)
	
	{
		Scanner s =new Scanner(System.in);
		int P[]=new int [10];
		int i;
		int Q[]=new int [6];
		int R[]=new int [P.length+Q.length];
		System.out.println("enter the P elements");
		for(i=0; i<10; i++)
			P[i]= s.nextInt();
		System.out.println("enter the Q elements");
			for(i=0; i<6; i++)
			Q[i]= s.nextInt();
		for(i=0; i<16; i++)
		{
			if(i<10)
				R[i]=P[i];
			else 
			    R[i]=Q[i-10];
		}
		System.out.println("P[]\tQ[]\tR[]");
		for(i=0; 1<16; i++)
		{
			if(i<6)
		System.out.println(+P[i]+"\t"+Q[i]+"\t"+R[i]);
	         else if(i<10)
		System.out.println(+P[i]+"\t\t"+R[i]);
		
            else
        System.out.println("\t"+"\t"+R[i]);				
				
				
		}
		
		
	}
}
