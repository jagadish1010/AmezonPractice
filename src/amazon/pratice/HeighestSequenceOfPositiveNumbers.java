package amazon.pratice;

import java.util.Scanner;

public class HeighestSequenceOfPositiveNumbers {

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int [] numbers = new int[n];
		
		for(int i=0;i<n;i++)
		{
		   numbers[i] = sc.nextInt(); 	
		}
		
		int pos_max=0;
		int count=0;
		int last = 0;
		for(int i=0;i<n;i++)
		{
			if(numbers[i]<0)
			{
				count++;
			}
			else
			{
			   	if(count>pos_max)
			   	{
			   	  pos_max =count;
			   	  count=0;
			   	  last=i-1;  
			   	}
			}
		}
		
		while(numbers[last]<0 && last>0)
		{
			last--;
		}
		
		if(numbers[last]<0 && last ==0)
		{
			System.out.println(last);
		}
		else
		{
			System.out.println(last+1);
		}
		
	}
}
