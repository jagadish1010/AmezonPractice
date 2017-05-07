package amazon.pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class PrintingHashMap {

	public static void main(String[] args)
	{
		HashMap<String, String> values = new HashMap<>();
		
		List<String> names = new ArrayList<>();
		values.put("JAGAISH", "HAGAF");
		values.put("JAGAISH1", "HAGAF");
		values.put("JAGAIS2", "HAGAF");
		values.put("JAGAIS3", "HAGAF");
		
		names.add("HEllo");
		names.add("HEllo");
		names.add("HEllo");
		names.add("HEllo");
		
		Iterator iterator = names.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
//		System.out.println(values.containsKey("JAGAISH"));
//		System.out.println(values.containsKey("JAGAISH1"));
//		
//		for(Entry<String, String> number : values.entrySet())
//		{
//			System.out.println(number.getValue());
//			System.out.println(number.getKey());
//		}
//		
		
		Iterator it = values.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			values.put("kj","df");
		}
		
		
	}
}
