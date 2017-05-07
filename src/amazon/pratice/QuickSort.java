package amazon.pratice;

import java.util.Scanner;

public class QuickSort {

	public static void main(String [] args)
	{
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		
		for(int i=0;i<n;i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(numbers, 0, n-1);
		
		System.out.println("Array elements are");
		
		for(int i=0;i<n;i++ )
		{
			System.out.println(numbers[i]);
		}
		
	}
	
	public void sort(int[] numbers,int low,int high)
	{
		if(low<=high)
		{
		int p= partitation(numbers,low,high);
		sort(numbers,low,p-1);
		sort(numbers,p+1,high);		
		}
	}

	private int partitation(int[] numbers, int low, int high) {
		// TODO Auto-generated method stub
		int pivote = low;
		int start=low+1;
		int end=high;
		
		while(start<end)
		{
			while(numbers[start]<numbers[pivote] && start<high)
			{
				System.out.println();
				start++;
			}
			
			while(numbers[end]>numbers[pivote] && end>low)
			{
				end--;
			}
			
			if(start<end)
			{
				int temp= numbers[start];
				numbers[start]= numbers[end];
				numbers[end]=temp;
			}
			
		}
		
		if(end<=start)
		{
			int temp= numbers[end];
		    numbers[end]=numbers[pivote];
	        numbers[pivote]=temp;	
		}
			
		return end;
	}	
}
