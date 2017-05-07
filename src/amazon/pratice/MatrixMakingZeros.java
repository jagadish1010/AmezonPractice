package amazon.pratice;

import java.util.Scanner;

public class MatrixMakingZeros {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] numbers = new int[m][n];
		int[][] final_numbers = new int[m][n];
		
		int[] row= new int[m];
		int[] col = new int[n];
		
		for(int i=0;i<n;i++)
		{
		   for(int j=0;j<m;j++)
			{
			 numbers[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++)
		{
		   for(int j=0;j<n;j++)
			{
			   if(numbers[i][j]==0)
			   {
			     row[i] =1;
			     col[j] =1;
			   }
			}
		}
		
		for(int i=0;i<n;i++)
		{
		  for(int j=0;j<m;j++)
		   {
			   if(row[i]==1 || col[j]==1)
			   {
				   final_numbers[i][j]=0;
			   }
			   else
			   {
				   final_numbers[i][j]=numbers[i][j];
			   }
		   }
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(final_numbers[i][j]);
			}
		}
		
		
	}
	
}
