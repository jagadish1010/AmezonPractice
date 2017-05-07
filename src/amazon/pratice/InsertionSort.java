package amazon.pratice;

import java.util.Scanner;

public class InsertionSort {

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
		
		InsertionSort insertionSorting = new InsertionSort();
		insertionSorting.sorting(numbers);
		System.out.println("Array elements are");
		
		for(int i=0;i<n;i++ )
		{
			System.out.println(numbers[i]);
		}

	}
	private void sorting(int[] numbers) {
		   
		   for(int j=1;j<numbers.length;j++)
		   {
			   int k= numbers[j];
			   int i=j-1;
			   
			   while(i>=0 && numbers[i]>=k)
			   {
				   numbers[i+1]=numbers[i];
				   i--;
			   }
			   
			   numbers[i+1]=k;
		   }
		  	
		}
}
