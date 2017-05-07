package amazon.pratice;

import java.util.Scanner;

public class QueueImplementaion {

	int[] numbers =new int[10];
	int r=-1;
	int f=-1;
	
	public static void main(String[] args)
	{
		QueueImplementaion implementaion = new QueueImplementaion();
		while(true)
		{
		System.out.println("Enter your choice 1: push 2: pop");
	    int choice ;
	    Scanner sc = new Scanner(System.in);
	    choice=sc.nextInt();
	    switch(choice)
	    {
	    case 1: System.out.println("Enter the element"); 
	    	   int number=sc.nextInt(); 
	    	   implementaion.push(number);
	           break;  
	    case 2:   
 	   			int element=implementaion.pop();
 	   			System.out.println("Poped element is"+element);
 	   			break; 
	    case 3: System.out.println("Enter the element to check");
	            int element_to_found=sc.nextInt();
	            if(implementaion.elementExist(element_to_found))
	            	System.out.println("Element found");
	            else
	            	System.out.println("Element doesn't exists");
	            break;
	    case 4: System.out.println("Enter the element to check");
        		int element_to_delete=sc.nextInt();
        		if(implementaion.removeElement(element_to_delete))
        			System.out.println("Element found");
        		else
        			System.out.println("Element doesn't exists");
        		break;        
	            
	    }
		}
	}
	
	public void push(int number)
	{
		if(r==numbers.length-1)
		{
			System.out.println("Queue is full");
		}
		else
		{
			numbers[++r]=number;
			if(f==-1)
			f++;
		}
	}
	
	public int pop()
	{
		int element = 0;
		if(f==-1)
		{
			System.out.println("Queue is underflow");
		}
		else
		{
			element =numbers[f];
			f++;
			if(f==r)
			{
			 f=-1;
			 r=-1;
			}
		}
		return element;
	}
	
	public boolean elementExist(int element)
	{
		int m=f;
		int [] dupnumbers = new int[10];
		int i=0;
		boolean found=false;
		while(f<=r)
		{
			if(element==numbers[f])
			{
			 found=true;	
			 break;
			}
		   else
		   {
			  dupnumbers[i]=numbers[f];  
			  i++;
			  f++;
		   }
		}
		while(i>0)
		{
			numbers[f-1]=dupnumbers[i-1];
			i--;
			f--;
		}
	  return found;
	}
	
	public boolean removeElement(int element)
	{
		int m=f;
		int [] dupnumbers = new int[10];
		int i=0;
		boolean found=false;
		while(f<=r)
		{
			if(element==numbers[f])
			{
			 found=true;	
			 break;
			}
		   else
		   {
			  dupnumbers[i]=numbers[f];  
			  i++;
			  f++;
		   }
		}
		while(i>0)
		{
			numbers[f]=dupnumbers[i-1];
			i--;
			f--;
		}
	  return found;
	}
}
