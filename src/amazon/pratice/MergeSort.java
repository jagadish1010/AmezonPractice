package amazon.pratice;

import java.util.Scanner;

public class MergeSort {

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
		
		MergeSort mergeSort  = new MergeSort();
		mergeSort.mergeSort(numbers, 0, n-1);
		
		System.out.println("Array elements are");
		
		for(int i=0;i<n;i++ )
		{
			System.out.println(numbers[i]);
		}
		
	}
	
	void mergeSort(int[] numbers,int low, int high)
	{
		int mid=(low+high)/2;
		if(low<high)
		{
		mergeSort(numbers, low, mid);
		mergeSort(numbers, mid+1, high);
		merge(numbers,low,mid,high);
		}
	}

	 void merge(int[] numbers, int low, int mid, int high) {
		// TODO Auto-generated method stub
		
		 int n1 = mid-low+1;
		 int n2 = high-mid;
		 
		 int[] first = new int[n1];
		 int[] second = new int[n2];
		 
		 int i=0;
		 int j=0;
		 
		 while(i<n1)
		 {
			 first[i]=numbers[low+i];
			 i++;
		 }
		 
		 while(j<n2)
		 {
			 second[j]= numbers[mid+1+j];
			 j++;
		 }
		 i=0;
		 j=0;
		 int k=low;
		 
		 while(i<n1 && j<n2)
		 {
			 if(first[i] <= second[j])
			 {
				 numbers[k] = first[i];
				 i++; 
			 }
			 else
			 {
				 numbers[k] = second[j];
				 j++;
			 }
			 k++;
		  }
		 
		 while(i<n1)
		 {
			 numbers[k] = first[i];
			  i++;
			 k++;
		 }
		 
		 while(j<n2)
		 {
			 numbers[k] = second[j];
			 j++;
			 k++;
		 }		 
	}
	
}
