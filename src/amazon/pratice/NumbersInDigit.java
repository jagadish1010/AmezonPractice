package amazon.pratice;

import java.util.Scanner;

public class NumbersInDigit {

public static void main(String[] args)	
{
	Scanner sc = new Scanner(System.in);
	int numbers= sc.nextInt();
	String finalNumber = "";
	String number;
	int i=0;
	while(numbers>0)
	{
		 int digit=numbers%10;
		 System.out.println(digit);
		 String zeros = "";
		 for(int j=0;j<i;j++)
		 {
		    zeros=zeros+"0";
		 }
		 i++;
		 finalNumber=digit+zeros+"+"+finalNumber;
		 numbers=numbers/10;		 
	}
	
	System.out.println("Finalnumber is"+finalNumber);
 }
}
