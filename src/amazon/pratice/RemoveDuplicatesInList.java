package amazon.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesInList {

	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<12;i++)
		{
			numbers.add(sc.nextInt());
		}
		
		int[] occurence = new int[12];
		
		for(int i=0;i<12;i++)
		{
			occurence[i]=-1;
		}
		
		for( Integer i=0;i<numbers.size();i++)
		{		  
			if(occurence[i]==-1)
			{
				occurence[i]=1;
			}
		   for(Integer j=i+1; j<numbers.size();j++)
			{
				if(numbers.get(i)==numbers.get(j))
				{
					if(occurence[i]>0)
					{
					occurence[i]++;
					occurence[j]=0;
					}
				}
				
			}
		}
		
		for(int j=0;j<numbers.size();j++)
		{
			if(occurence[j]>0)
			{
				System.out.println(numbers.get(j) +"Count is"+occurence[j]);
			}
		}
	}
	
}
