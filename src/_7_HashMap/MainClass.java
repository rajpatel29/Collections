package _7_HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass 
{
	public static void main(String args[])
	{
		
//		The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls
	
//		This implementation provides constant-time performance for the basic operations (get and put), assuming the hash function 
//		disperses the elements properly among the buckets. Iteration over collection views requires time proportional to the "capacity" 
//		of the HashMap instance (the number of buckets) plus its size (the number of key-value mappings). Thus, it's very important not
//		to set the initial capacity too high (or the load factor too low) if iteration performance is important.
		
		
//		An instance of HashMap has two parameters that affect its performance: initial capacity and load factor. 
//		The capacity is the number of buckets in the hash table, and the initial capacity is simply the capacity at the time the hash table
//		is created. The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased.
//		When the number of entries in the hash table exceeds the product of the load factor and the current capacity
		
		
		
		Map<Integer , String> hashmap = new HashMap<>();

		hashmap.put(null, "Five");
		hashmap.put(1, "One");
		hashmap.put(2, "Two");
		hashmap.put(3, "Three");
		hashmap.put(4, "Four");
		hashmap.put(5, "Five");
		
		System.out.println(hashmap);
		System.out.println();
		
		
		//to make HashMap synchronized
		Map<Integer, String> syncHashMap = Collections.synchronizedMap(hashmap);
		System.out.println("Synchronized map " + hashmap);
		
		
		
		
		//Iterate through map
		
		for(Map.Entry<Integer, String> pair : hashmap.entrySet() )
		{
			System.out.println(pair.getKey() + " has value of " + pair.getValue());
		}
		System.out.println();
		System.out.println();
		
		
		//if the map is structurally modified at any time after the iterator is created, in any way except through the 
		//iterator's own remove method, the iterator will throw a ConcurrentModificationException.
		
		
		Iterator iterator = hashmap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> pair = (Entry<Integer, String>) iterator.next();
			System.out.println(pair.getKey() + " has value of " + pair.getValue());
			
			iterator.remove();
		}
		
	}
}
