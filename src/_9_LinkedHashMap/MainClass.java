package _9_LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) 
	{
		//It maintains insertion order
		
		Map<Integer , String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put(1, "Hi");
		linkedHashMap.put(3, "Hello");
		linkedHashMap.put(110, "How");
		linkedHashMap.put(5, "When");
		
		System.out.println(linkedHashMap);
		
		System.out.println();
		
		Iterator iterator = linkedHashMap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> pair = (Entry<Integer, String>) iterator.next();
			System.out.println(pair.getKey() + " has a value of " + pair.getValue());
		}
	}

}
