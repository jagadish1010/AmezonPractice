package amazon.pratice;

import java.util.Scanner;

public class FindMaxInSortedRotatedArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i=0;i<n;i++)
		{
		  numbers[i]=sc.nextInt();
		}
		  
		int max=search(numbers,0,n-1);
		System.out.println("MAximum element is"+max);
	}
	
	public static int search(int[] numbers,int low,int high)
	{
		if(high<low)
		{
			return low;
		}
		if(low==high)
		{
			return low;
		}
		   int mid= (low+high)/2;
           
		   if(numbers[mid]>numbers[mid+1])
		   {
			   return numbers[mid];
		   }
		   else if(numbers[mid-1]>numbers[mid])
		   {
			   return numbers[mid-1];
		   }
		   
		   else if(numbers[low]<numbers[mid])
		   {
			  return search(numbers,mid+1,high);   
		   }
		   
		   else
			   return search(numbers,low,mid-1);
		
		
		
	}
}
