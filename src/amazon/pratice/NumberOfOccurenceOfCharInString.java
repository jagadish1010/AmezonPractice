package amazon.pratice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class NumberOfOccurenceOfCharInString {

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String test =sc.nextLine();
	numberOfOccInStringUsingHashMap(test);
	numberOfOccInStringUsingArray(test);
}

public static void numberOfOccInStringUsingHashMap(String test)
{
	HashMap<Character, Integer> counters = new HashMap<>();
    for(int i=0;i<test.length();i++)
    {
       	if(counters.containsKey(test.charAt(i)))
       	{
       		int count=counters.get(test.charAt(i));
       		counters.put(test.charAt(i), ++count);
       	}
       	else
       	{
       		counters.put(test.charAt(i), 1);
       	}
    }
    for(Entry<Character, Integer> count : counters.entrySet())
    {
         System.out.println("Character"+count.getKey()+" : "+count.getValue()); 
    }
}

public static void numberOfOccInStringUsingArray(String test)
{
	int[] numbers = new int[256];
	
	for(int i=0;i<test.length();i++)
	{
		++numbers[test.charAt(i)];		
	}
	
	int count=0;
	Character c = ' ';
	String abc="";
	for(int i=0;i<256;i++)
	{
		 if(numbers[i]>=1)
		 {
			 System.out.println("Char is"+Character.toString ((char) i)+"Value is"+ numbers[i]);
			 abc=abc+Character.toString ((char) i)+numbers[i];
		 }
		 //maximum repeating characters
		 if(numbers[i]>count)
		 {
			 count = numbers[i];
			 c = (char)i;
		 }
	}
	
	System.out.println("Character is"+c);
	
	System.out.println("the count of each char is"+ abc);
	
}
	


}
