package _10_TreeMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainClass 
{
	public static void main(String args[])
	{
		
//		A TreeMap provides an efficient means of storing key/value pairs in sorted order
		
		
		
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer,String>();
		
		treemap.put(3, "three");
		treemap.put(2, "two");
		treemap.put(4, "four");
		treemap.put(1, "one");
		
		System.out.println(treemap);
		
		System.out.println();
		
		Map<Integer, String> syncTreeMap = Collections.synchronizedMap(treemap);
		System.out.println("Synchronized treemap " + syncTreeMap);
		
		
		System.out.println();
		
		Iterator iterator = treemap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> pair  = (Entry<Integer, String>) iterator.next();
			System.out.println(pair.getKey() + " has value of " + pair.getValue());
		}
	}
}
