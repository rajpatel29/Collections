package _2_LinkedHashSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainClass 
{
	public static void main(String args[])
	{
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add(null);
		linkedHashSet.add("Hi");
		linkedHashSet.add("Hi");
		linkedHashSet.add("There");
		linkedHashSet.add("How");
		linkedHashSet.add("is");
		
		//It will remove duplicates 
		//It maintains insertion order of elements much like list interface
		System.out.println(linkedHashSet);
		System.out.println();
		
		
		
		
		//same for each type of set
		
		//Note that this implementation is not synchronized. 
		//If multiple threads access a hash set concurrently, and at least one of the threads modifies the set,
		//it must be synchronized externally.
		//This is typically accomplished by synchronizing on some object that naturally encapsulates the set. 
		//If no such object exists, the set should be "wrapped" using the Collections.synchronizedSet method
		Set<String> syncLinkedHashSet = Collections.synchronizedSet(linkedHashSet);
		System.out.println("Syncronized set is " + syncLinkedHashSet);
		System.out.println();

		
		
		
		
		//same for each type of set
		//iterate through linkedHashSet
		
		System.out.println("Using Iterator");
		Iterator<String> iterator = linkedHashSet.iterator();
		while(iterator.hasNext())
		{
			String temp = (String) iterator.next();
			System.out.println(temp);
		}
		
		
		System.out.println();
		System.out.println();

		
		System.out.println("Second way to iterate");
		Object array[] = linkedHashSet.toArray();
		for (int i = 0; i < array.length; i++) 
		{
			String tmp = (String) array[i];
			System.out.println(tmp);
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("third way to do iterate(Bad way)");
		for(String s : linkedHashSet)
		{
			System.out.println(s);
		}
				
	}
}
