import java.util.*;

class MatriXMul
{
	static void mulMat(int mat1[][],int mat2[][],int res[][],int size)
	{
		for(int i=0; i<size; i++)
		{     
			for(int j=0; j<size; j++)
			{      res[i][j]=0;
				for(int k=0; k<size; k++)
				res[i][j]+=mat1[i][k]*mat2[k][j];
			}
		}
	}
	
	public static void main(String...args)
	{
		
	   Scanner s = new Scanner(System.in);
	   System.out.println("enter the size of the matrix");
	    int size = s.nextInt();
		int mat1[][]=new int[size][size];
		int mat2[][]=new int[size][size];
		int res[][]=new int[size][size];
		for(int i=0; i<mat1.length; i++)
			for(int j=0; j<mat1.length; j++)
			mat1[i][j]=s.nextInt();
		for(int i=0; i<mat2.length; i++)
			for(int j=0; j<mat2.length; j++)
			mat2[i][j]=s.nextInt();
		mulMat(mat1,mat2,res,size);
		for(int i=0; i<res.length; i++)
        {
			for(int j=0; j<res.length; j++)

				{
					
				System.out.println(res[i][j]+" ");
			}				
		}
	}		
		
}