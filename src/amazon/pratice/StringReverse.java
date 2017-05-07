package amazon.pratice;

import java.util.Scanner;

public class StringReverse {

public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
 

  String test = sc.nextLine();

  
  int i=0;
  int j= test.length()-1;
  String finalString="";
  String second="";
  while(i<j)
  {
	   while(test.charAt(i)!=' ' && i<j)
	  {
		second=second+test.charAt(i);
		i++;
	  }
	   i++;
	   finalString = second+" "+finalString;
	   second="";
  }
   
  System.out.println("final string is = "+ finalString);
 }
}
