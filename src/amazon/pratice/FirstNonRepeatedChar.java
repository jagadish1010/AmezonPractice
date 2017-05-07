package amazon.pratice;

public class FirstNonRepeatedChar {

	public static void main(String[] args)
	{
		String abc = "Jagadish Hatti from saunshi";
		
		int[] numbers = new int[256];
		
		for(int i=0;i<abc.length();i++)
		{
			numbers[abc.charAt(i)]=++numbers[abc.charAt(i)];
		}
		
		for(int i=0;i<256;i++)
		{
			if(numbers[i]>0)
			{
			System.out.println("Char is"+Character.toString ((char) i) +"Value is"+ numbers[i]);
		    }
		}
		
		for(int i=0;i<abc.length();i++)
		{
			if(numbers[abc.charAt(i)]==1)
			{
				System.out.println("First char is ="+abc.charAt(i));
				break;
			}
		}
	}
}
