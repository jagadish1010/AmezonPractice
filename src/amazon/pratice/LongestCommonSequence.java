package amazon.pratice;

import java.util.Scanner;

public class LongestCommonSequence {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		int m=first.length();
		int n=second.length();
		int[][] matrix = new int[m+1][n+1];  
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
				{
				  matrix[i][j]=0;
				}
				else if(first.charAt(i-1)==second.charAt(j-1))
				{
				  matrix[i][j]=matrix[i-1][j-1]+1;
				}
				else
				{
				  matrix[i][j] = Math.max(matrix[i-1][j],matrix[i][j-1]);
				}
			}
		}
		System.out.println("Maxmium count is"+matrix[m][n]);
		
		int i=m;
		int j=n;
	
		String lcs = "";
		while(i>0 && j>0)
		{
			if(first.charAt(i-1) == second.charAt(j-1))
			{
				lcs=first.charAt(i-1)+lcs;
				i--; j--;
			}
			else if(matrix[i-1][j]> matrix[i][j-1])
			{
				i--;
			}
			else
			{
				j--;
			}
		}
		
		System.out.println("The longest sequence = "+lcs);
	}
}
