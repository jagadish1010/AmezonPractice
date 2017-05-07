package amazon.pratice;

import java.util.Scanner;

public class StackMin {

	int top=-1;
	int mintop=-1;
	int min=200;
	static int[] numbers_min = new int[10];
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int[] numbers = new int[n];
	  
      StackMin stackMin = new StackMin();
      for(int i=0;i<numbers_min.length;i++)
      {
    	  numbers_min[i]=100;
      }
      
      while(true)
      {
      System.out.println("Enter your choice");
      
      int choice = sc.nextInt();   
      
      switch(choice)
      {
      case 1: System.out.println("Enter the element");
              int element = sc.nextInt();
              stackMin.push(numbers, element, n);  
              break;
      case 2: int number = stackMin.pop(numbers);
              System.out.println("Poped number is"+ number);  
              break; 
      case 3: int min_number = stackMin.min();
              System.out.println("Min number is"+ min_number);  
              break; 
      case 4: System.out.println("Invalid input"); 
    	      break; 
      }
      }
	}
	
	public void push(int[] numbers,int element,int size)
	{   
		if(mintop<0)
		{
			numbers_min[++mintop] = element;
		}
		
		else if(element<numbers_min[mintop])
		{
		   numbers_min[++mintop] = element;
		}
		if(top==size-1)
		{
			System.out.println("Stack is full");
		}
       		
		else
		{
		   numbers[++top] = element;  
		}
	}
	
	public int pop(int []  numbers)
	{
		if(top==-1)
		{
			System.out.println("Statck is underfull");
			return 0;
		}
		else	   
			{
			if(numbers_min[mintop]==numbers[top])
			{
			   mintop--;	
			}
			return numbers[top--];
			}	
	}
	public int min()
	{
		return numbers_min[mintop];
	}
	
}
