package _3_TreeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainClass 
{
	public static void main(String args[])
	{
		Set<String> treeset = new TreeSet<>();
		
		
		//we can not add null in TreeSet otherwise we will get NullPointerException
//		treeset.add(null);
		treeset.add("Hi");
		treeset.add("Hello");
		treeset.add("Hey");
		treeset.add("Hi");
		treeset.add("Abc");
		treeset.add("abc");
		
		
		
		//It will remove duplicates 
		//Objects are stored in sorted, ascending order
		System.out.println(treeset);
		System.out.println();
		
		
		
		
		//same for each type of set
		
		//Note that this implementation is not synchronized. 
		//If multiple threads access a hash set concurrently, and at least one of the threads modifies the set,
		//it must be synchronized externally.
		//This is typically accomplished by synchronizing on some object that naturally encapsulates the set. 
		//If no such object exists, the set should be "wrapped" using the Collections.synchronizedSet method
		Set<String> syncTreeSet = Collections.synchronizedSet(treeset);
		System.out.println("Syncronized set is " + syncTreeSet);
		System.out.println();
		
		
		
		
		//same for each type of set
		//iterate through treeset
		
		System.out.println("Using Iterator");
		Iterator<String> iterator = treeset.iterator();
		while(iterator.hasNext())
		{
			String temp = (String) iterator.next();
			System.out.println(temp);
		}
		
		
		System.out.println();
		System.out.println();

		
		System.out.println("Second way to iterate");
		Object array[] = treeset.toArray();
		for (int i = 0; i < array.length; i++) 
		{
			String tmp = (String) array[i];
			System.out.println(tmp);
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("third way to do iterate(Bad way)");
		for(String s : treeset)
		{
			System.out.println(s);
		}
				
		
	}
}
