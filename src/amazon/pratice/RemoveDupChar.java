package amazon.pratice;

import java.util.Scanner;

public class RemoveDupChar {
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String testString = sc.nextLine();
		
		char [] test = testString.toCharArray();
		
		int tail=1;
		
		for(int i=1;i<test.length;i++)
		{
			int j;
		   for(j=0;j<tail;j++)
		   {
			   if(test[i]==test[j])
			   {
				   break;
			   }
		   }
		   
		   if(j==tail)
		   {
			   test[tail]=test[i];
			   tail++;
		   }
		}
		
		test[tail]=0;
		
		for(int i=0;i<tail;i++)
		{
			System.out.println(test[i]);
		}
			
	}
	
}
