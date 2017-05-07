package amazon.pratice;

import java.util.Scanner;

public class maximumCosugativeOnes {

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
		
		int max=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			
			if(numbers[i]==1)
			{
				count++;
			}
			else
			{
				if(count>max)
				{
					max=count;
					count=0;
				}
			}
		}
		
		System.out.println("Count is"+ max);
	}
	
}
