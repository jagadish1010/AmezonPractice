package amazon.pratice;

import java.util.Scanner;

public class FormationOfPalindome {

	public static void main(String[] args)
	{
		boolean odd=false; 
	
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		int[] count = new int[256];
		
		for(int i=0;i<test.length();i++)
		{
			++count[test.charAt(i)];
		}
		for(int i=97;i<123;i++)
		{
		   Character c= (char) i;
		   
		    if(count[i]%2==1)
		    {
			   if(!odd)
			   {
		    	odd=true;
			   }
			   else
			   {
				   System.out.println("This String is cant be formed as palindrome");
			   }
		    }
		}
		boolean first=false;
		for(int i=97;i<123;i++)
		{
		   Character c= (char) i;
		   
		    if(count[i]%2==1)
		    {
			   if(!first)
			   {
		    	first=true;
			   }
			   else
			   {
				   count[i]--;
			   }
		    }
		}
		
		int length=0;
		for(int i=97;i<123;i++)
		{
		    length+=count[i] ;
		}
		
		System.out.println("Length is"+ length);
	}
	
}
