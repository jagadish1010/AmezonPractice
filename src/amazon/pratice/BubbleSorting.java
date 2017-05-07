package amazon.pratice;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class BubbleSorting {

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
		
		BubbleSorting bubbleSorting = new BubbleSorting();
		bubbleSorting.sorting(numbers);
		System.out.println("Array elements are");
		
		for(int i=0;i<n;i++ )
		{
			System.out.println(numbers[i]);
		}

	}
	
	public void sorting(int[] numbers)
	{
		int i=0;
		int j=numbers.length;
	    
		for(i=0;i<numbers.length;i++)
		{
			for(j=0; j<numbers.length-1;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1] = temp; 
				}
			}
		}
	}
}
