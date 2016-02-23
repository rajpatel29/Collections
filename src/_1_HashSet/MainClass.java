package _1_HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass 
{
	public static void main(String args[])
	{
		
		//Difference between different types of sets
		//1) Performance and Speed: 
		//HashSet is fastest, LinkedHashSet is second on performance or almost similar to HashSet but 
		//TreeSet is bit slower because of sorting operation it needs to perform on each insertion. 
		//TreeSet provides guaranteed O(log(n)) time for common operations like add, remove and contains, 
		//while HashSet and LinkedHashSet offer constant time performance e.g. O(1) for add, contains and remove
		//given hash function uniformly distribute elements in bucket.
		
		//2) Ordering:
		//HashSet does not maintain any order 
		//while LinkedHashSet maintains insertion order of elements much like List interface 
		//and TreeSet maintains sorting order or elements.
		
		//3) null: 
		//Both HashSet and LinkedHashSet allows null 
		//but TreeSet doesn't allow null and throw java.lang.NullPointerException when you will insert null into TreeSet.
		
		
		
		Set<String> hashset = new HashSet<>();
		
		//you can add null 
		hashset.add(null);
		hashset.add("hi");
		hashset.add("there");
		hashset.add("there");
		hashset.add("hello");
		
		//It will remove duplicates 
		//it does not maintain any order
		System.out.println(hashset);
		System.out.println();
		

		
		//same for each type of set
		//Note that this implementation is not synchronized. 
		//If multiple threads access a hash set concurrently, and at least one of the threads modifies the set,
		//it must be synchronized externally.
		//This is typically accomplished by synchronizing on some object that naturally encapsulates the set. 
		//If no such object exists, the set should be "wrapped" using the Collections.synchronizedSet method
		Set<String> syncHashset = Collections.synchronizedSet(hashset);
		System.out.println("Syncronized set is " + syncHashset);
		System.out.println();
		
		
		
		//same for each type of set
		//iterate through hashset
		System.out.println("Using Iterator");
		Iterator<String> iterator = hashset.iterator();
		while(iterator.hasNext())
		{
			String temp = (String) iterator.next();
			System.out.println(temp);
		}
		
		
		System.out.println();
		System.out.println();

		
		System.out.println("Second way to iterate");
		Object array[] = hashset.toArray();
		for (int i = 0; i < array.length; i++) 
		{
			String tmp = (String) array[i];
			System.out.println(tmp);
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("third way to do iterate(Bad way)");
		for(String s : hashset)
		{
			System.out.println(s);
		}
		
	}
}
