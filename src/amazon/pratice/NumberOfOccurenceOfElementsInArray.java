package amazon.pratice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class NumberOfOccurenceOfElementsInArray {

public static void main(String[] args)
{
	System.out.println("enter the sizeof array");
    Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int[] numbers = new int[n];
	for(int i=0;i<n;i++)
	{
		numbers[i]=sc.nextInt();
	}
    numberOfOccurenceWithHashMap(numbers);
    numberOfOccurenceWithArray(numbers,n);
}

public static void numberOfOccurenceWithHashMap(int[] numbers)
{
	LinkedHashMap<Integer, Integer> count =new LinkedHashMap<>();
    for(int i=0;i<numbers.length;i++)
    {  
    	if(count.containsKey(numbers[i]))
    	{
    		int num=count.get(numbers[i]);
    		count.put(numbers[i], ++num);
    	}
       	
    	else
    	{
    	    count.put(numbers[i], 1);
    	}        	
    }
    
    for(Entry<Integer, Integer> number : count.entrySet())
    {
    	System.out.println(number.getKey()+":"+number.getValue());
    }
}

public static void numberOfOccurenceWithArray(int[] numbers,int size)
{
	int count;
	int[] frequency = new int[size]; 
	for(int i=0;i<size;i++)
	{
		frequency[i]=-1;
	}
	for(int i=0;i<size;i++)
	{
		count=1;
		for(int j=i+1;j<size;j++)
		{
			if(numbers[i]==numbers[j])
			{
				count++;
				frequency[j]=0;
			}
			
		}
		
		if(frequency[i]!=0)
		{
			frequency[i]=count;
			count=0;
		}
	}
	
	
	for(int i=0;i<size;i++)
	{
		if(frequency[i]!=0)
		{
		System.out.println("The occurence of number " + numbers[i] + "is" +frequency[i]);
		}
	}
}



}
