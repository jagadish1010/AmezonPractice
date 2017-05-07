package amazon.pratice;

import java.util.Scanner;

public class SelectionSort {

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
		
		SelectionSort selectionSorting = new SelectionSort();
		selectionSorting.sorting(numbers);
		System.out.println("Array elements are");
		
		for(int i=0;i<n;i++ )
		{
			System.out.println(numbers[i]);
		}

	}
	private void sorting(int[] numbers) {
		// TODO Auto-generated method stub
		int i=0;
		int j=1;
		int loc=0;
		for( i=0;i<numbers.length;i++)
		{
			int min =100;
			loc=i;
			
			for( j=i+1;j<numbers.length;j++)
			{   	
				if(numbers[j]<min)
				{
					min=numbers[j];
					loc=j;
				}
			}
			
			int temp= numbers[i];
			numbers[i] = numbers[loc];
            numbers[loc]=temp; 			
		}
		
	}
	
	
	
}
