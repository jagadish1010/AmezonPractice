package amazon.pratice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		int i=0;
		int j=check.length()-1;  
		boolean palindrome = true;
		while(i<j)
		{
			if(check.charAt(i)!=check.charAt(j))
			{
				palindrome=false;
				break;
			}
			i++;
			j--;
		}
		
		if(palindrome)
		{
			System.out.println("String "+check+" is palindrome");
		}
		else
		{
			System.out.println("String "+check+" is not palindrome");
		}
		
	}
	
	
}
