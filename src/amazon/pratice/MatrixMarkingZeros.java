package amazon.pratice;

import java.util.Scanner;

public class MatrixMarkingZeros {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int m = sc.nextInt();
		int n= sc.nextInt();
		
		int[][] numbers =new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				numbers[i][j]=sc.nextInt();
			}
		}
		
		int[] rows= new int[m];
		int[] columns = new int[n];
		for(int i=0;i<m;i++)
		{
			for(int j=0; j<n;j++)
			{
				if(numbers[i][j]==0)
				{
					rows[i]=1;
					columns[j]=1;
				}
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(rows[i]==1 || columns[j]==1)
				{
				    numbers[i][j]=0;	
				}
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println(numbers[i][j]);
			}
		}

		
		
	}
	
}
