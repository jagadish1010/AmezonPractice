package amazon.pratice;

import java.util.Scanner;

public class MaxNumberInSortedRotatedArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] numbers = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	numbers[i]=sc.nextInt();
	    }
	
	   
	   int max= findMaxInRotatedArray(numbers,0,numbers.length-1);
	   System.out.println("Max element is"+max);
		
	}
	
	public static int findMaxInRotatedArray(int[] numbers, int low, int high)
	{
		
		if(high< low)
		 return numbers[0];
		if(low==high)
		 return numbers[low];
        
		int mid =(low+high)/2;
		
		if(numbers[mid-1]>numbers[mid])
		{
			return numbers[mid-1];
		}
		if(numbers[mid]>numbers[mid+1])
		{
			return numbers[mid];
		}
		else if(numbers[high]>numbers[mid])
			return findMaxInRotatedArray(numbers, low, mid-1);
		else
			return findMaxInRotatedArray(numbers, mid+1,high);
	}
	
}
