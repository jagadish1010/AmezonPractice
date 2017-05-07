package amazon.pratice;

import java.util.Scanner;

public class PrintingMatrixInSpiralFormat {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row size");
		int row=sc.nextInt();
		System.out.println("Enter column size");
		int col = sc.nextInt();
		
		int[][] numbers = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				numbers[i][j] = sc.nextInt();
			}
		}
		
		printMatrixInSpiral(numbers,row,col);
	}
	
	public static void printMatrixInSpiral(int[][] numbers, int row,int col)
	{
		int start_row =0;
		int start_col= 0;
		int end_row= row;
		int end_col=col;
		
		while(start_row<end_row && start_col<end_col )
		{
			for(int i=start_col ; i<end_col;++i)
			{
				System.out.println("Element in "+start_row+" row is"+ numbers[start_row][i] );
			}
			
			start_row++;
			
			for(int i=start_row; i<end_row; ++i)
			{
				System.out.println("Element in "+end_col+"column is"+ numbers[i][end_col-1]);
			}
			end_col--;
			
			if(start_row<end_row)
			{
			for(int i=end_col-1;i>=start_col;i--)
			{
				System.out.println("Elelemt in "+end_row+"is"+ numbers[end_row-1][i]);	
			}
			  end_row--;
			}
			
			if(start_col< end_col)
			{			
			for(int i=end_row-1;i>=start_row;i--)
			{
				System.out.println("Element in "+start_row+"is "+ numbers[i][start_col]);
			}
			start_col++;
			}
		}	
	}
	
}
