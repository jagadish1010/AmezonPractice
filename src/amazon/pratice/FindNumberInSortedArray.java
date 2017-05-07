package amazon.pratice;

import java.util.Scanner;

public class FindNumberInSortedArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i=0;i<n;i++)
		{
		  numbers[i]=sc.nextInt();
		}
		 
		int searchNumber =sc.nextInt();
	     
		search(numbers,0,n-1,searchNumber);
	    			
	}
	
	
	public static void search(int[] numbers,int low,int high,int element)
	{
		if(low<=high)
		{
		int mid =(low+high)/2;
		if(numbers[mid]==element)
		{
			System.out.println("Element" + element +" found at location "+ mid);	
		}
		else
		{
			if(numbers[low]<=numbers[mid] )
			{
                if(numbers[low]<=element && element<numbers[mid])
				search(numbers,low,mid-1,element);
                else
                search(numbers,mid+1,high,element);
			}
			else
			{
				if(numbers[mid]<element && element<=numbers[high])
				search(numbers,mid+1,high,element);
				else
				search(numbers,low,mid-1,element);
			}
		}
	  }
		else
			System.out.println("Element "+element+ "not found");
	}
	
}
