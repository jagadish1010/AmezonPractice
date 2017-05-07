package amazon.pratice;

import java.util.Scanner;

public class NumberOfOccurenceOfGivenArray {
	public static void main(String[] args)
	{
		
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		
		for(int i=0;i<n;i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		int[] occurence = new int[n];
		
		for(int i=0;i<n;i++)
		{
			occurence[i]=-1;
		}
		
		
		for(int i=0;i<n;i++)
		{
			if(occurence[i]==-1)
			{
				occurence[i]=1;
			}
			
		  for(int j=i+1;j<n;j++)
			{ 
				if(numbers[i]==numbers[j] && occurence[i]>0)
				{
				  occurence[i]++;
				  occurence[j]=0; 
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(occurence[i]>0)
			{
				System.out.println("Number of occurence "+occurence[i]+"for number "+numbers[i]);
			}
		}
		
	}	
}
