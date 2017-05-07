package amazon.pratice;

import java.util.Scanner;

public class LongestCommonSequencePractice {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		int m=first.length();
		int n=second.length();
		
		int [][] numbers = new int[m+1][n+1];
		
		
		for(int i=0;i<=m ;i++)
		{
		  for(int j=0;j<=n;j++)
			{
			if(i==0 || j==0)
			{
				numbers[i][j]=0;
			}
			else
			{
			   if(first.charAt(i-1)==second.charAt(j-1))
			{
				numbers[i][j] = 1+numbers[i-1][j-1];
			}
			
			else
			{
				numbers[i][j] = Math.max(numbers[i-1][j], numbers[i][j-1]);
			}
		}
			
		}
	 }
		System.out.println(numbers[m][n]);
		
		int i=m;
		int j=n;
		while(i>0 && j>0)
		{
			if(first.charAt(i-1)==second.charAt(j-1))
			{
				System.out.println(first.charAt(i-1));
				i--;
				j--;
			}
			else if(numbers[i-1][j] > numbers[i][j-1])
			{
				i--;
			}
			else
			{
				j--;
			}
		}
	}
}
	
