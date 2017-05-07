package amazon.pratice;

import java.util.Scanner;

public class multipleStacksInArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int [] numbers =new int[n];
		
		System.out.println("Enter the size each of stack");
		int m=sc.nextInt();
		
		int numberOfStacks=n/m;
		int[] top = new int[n/m];
		int[] bottom = new int[n/m];
		
		for(int i=0;i<numberOfStacks;i++)
		{
			top[i] = (n/numberOfStacks)*i-1;
			bottom[i] = (n/numberOfStacks)*i-1;
		}
				
		System.out.println("Enter your choice 1 for insert, 2 for deletion");
		
		int choice = sc.nextInt();
		int stackNumber;
		int element;
		while(true)
		{
		switch(choice)
		{
		case 1: System.out.println("Enter stack number");
		        stackNumber=sc.nextInt();
		        System.out.println("Enter the element to insert");
		        element=sc.nextInt();
		        
		        if(top[stackNumber]==bottom[stackNumber+1])
		        {
		        	System.out.println("Stack is full");
		        }
		        else
		        {	
		        	numbers[++top[stackNumber]]=element;
		        }
		        break;
		        
		case 2: System.out.println("Enter stack number to delete");
                stackNumber=sc.nextInt();
                
                if(top[stackNumber]==bottom[stackNumber])
                {
                	System.out.println("Stack is underflow");
                }
                
                else
                {
                	int number;
                	number=numbers[top[stackNumber]];
                	System.out.println("The deleted number is"+number);
                	top[stackNumber]--;
                }        
        		break;
		}
		
		}
	}
	
}
