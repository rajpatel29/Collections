package _8_HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass 
{
	public static void main(String args[])
	{
		//Difference between HashTable and HashMap
		
//		The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls
		
//		Performance :  Hashmap is much faster and uses less memory than Hashtable as former is unsynchronized . 
//		Unsynchronized objects are often much better in performance in compare to synchronized  object like Hashtable 
//		in single threaded environment.
		
		
		
		
		
		Map<Integer, String> hashtable = new Hashtable<>();
		
		hashtable.put(1, "One");
		hashtable.put(2, "Two");
		hashtable.put(3, "Three");
		hashtable.put(4, "Four");
		hashtable.put(5, "Five");
		
		
		System.out.println(hashtable);
		
		System.out.println();
		System.out.println();
		
		//It is synchronized
		
		
		//Iterate through Hashtable
		Iterator iterator = hashtable.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> pair = (Entry<Integer, String>) iterator.next();
			System.out.println(pair.getKey() + " has value of " + pair.getValue());
		}
		
		
	}
}
