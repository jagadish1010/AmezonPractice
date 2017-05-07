package amazon.pratice;

import java.util.Scanner;

public class MovingZerosToendOfArray {
	
public static void main(String[] args)
{
	int n;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	int[] numbers = new int[n];
	
	for(int i=0;i<n;i++)
	{
		numbers[i] = sc.nextInt();
	}
	
	int i=0;
	int j=n-1;
	
	while(i<j)
	{
		while(numbers[i]!=0 && i<n-1)
		{
			i++;
		}
		
		while(numbers[j]==0 && j>0)
		{
			j--;
		}
		
		if(i<j)
		{
			 int temp=numbers[i];
			 numbers[i]=numbers[j];
			 numbers[j]=temp;
		}
		else
		{
			break;
		}	
	}
	
	for(int m=0;m<numbers.length;m++)
	{
		System.out.println(numbers[m]);
	}
}
}
