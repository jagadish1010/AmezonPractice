package amazon.pratice;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class SearchElementInSortedRotatedArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] numbers = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	numbers[i]=sc.nextInt();
	    }
	
	    int searchElement = sc.nextInt();
	    
	    search(numbers,searchElement,0,numbers.length-1);
	}
	
	
	public static void search(int[] numbers,int number, int low, int high)
	{
		if(low<=high)
		{
			int mid = (low+high)/2;
			
			if(numbers[mid]==number)
			{
				System.out.println("Elelement "+number+"is found at position"+ mid);
			}
			else
			{
			if(numbers[low]<numbers[mid])
			{
				if(number>=numbers[low] && number<numbers[high])
				 search(numbers,number,low,mid-1);
				else
				 search(numbers,number,mid+1,high);	
			}
			
			else
			{
				if(number>numbers[mid] && number<=numbers[high])
				search(numbers,number,mid+1,high);
				else
				search(numbers,number,low,mid-1);	
			}
		}
	  }
	}
}
