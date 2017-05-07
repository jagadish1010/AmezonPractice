package amazon.pratice;

import java.util.Scanner;

public class AnagamOrNot {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		boolean anagram=true;
		int[] numbers = new int[256]; 
		
		String first = sc.nextLine();
		
		String second = sc.nextLine();
		
		for(int i=0;i<first.length();i++)
		{
		  ++numbers[first.charAt(i)]; 
		}
		
		for(int i=0;i<second.length();i++)
		{
		    --numbers[second.charAt(i)];	
		}
		
		for(int k=0;k<256;k++)
		{
			if(numbers[k]!=0)
			{
				anagram=false;
			}
		}
		
		if(anagram)
		{
			System.out.println("Strings are anagram");
		}
		
		else
		{
			System.out.println("Strings are not anagram");
		}
	}
}
