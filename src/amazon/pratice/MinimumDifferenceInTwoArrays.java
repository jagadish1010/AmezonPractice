package amazon.pratice;

import java.util.Scanner;

public class MinimumDifferenceInTwoArrays {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		int n1 =sc.nextInt();
		int [] numbers = new int[n1];
		int n2= sc.nextInt();
		int[] numbers_1 = new int[n2];
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(numbers, 0, n1);
		mergeSort.mergeSort(numbers_1, 0, n2);
		
		
		
		
	}
	
}
