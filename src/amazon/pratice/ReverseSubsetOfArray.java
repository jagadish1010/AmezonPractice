package amazon.pratice;

import java.util.Scanner;

public class ReverseSubsetOfArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i=0;i<n;i++)
		{
		    numbers[i]=sc.nextInt();
		}
		
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		
		for(int i=0;i<n;i=i+k)
		{
			int m=i;
			int o=i+k;
			o--;
		    while(m<o && o<n)
		    {
		       int	temp=numbers[m];
		    	numbers[m]=numbers[o];
		    	numbers[o] = temp;
		        m++;
		        o--;
		    }
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(numbers[i]);
		}
	}
}
