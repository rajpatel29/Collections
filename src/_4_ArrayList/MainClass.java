package _4_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;






public class MainClass 
{
	public static void main(String args[])
	{
		
//-->		//ArrayList supports dynamic arrays that can grow as needed.
		
			//Standard Java arrays are of a fixed length. After arrays are created, 
			//they cannot grow or shrink, which means that you must know in advance how many elements an array will hold.

			//Array lists are created with an initial size. When this size is exceeded, the collection is automatically enlarged.
			//When objects are removed, the array may be shrunk
		
		
		String temp;
		List<String> arrayList = new ArrayList<>();
	

		//allows null
		arrayList.add(null);
		arrayList.add("Hi");
		arrayList.add("2");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("Hello");
		arrayList.add("Abc");
		arrayList.add("BAc");
		
		
		
		
		//allows duplicates
		//retrieves same as insertion order
		System.out.println(arrayList);
		System.out.println();

		
		arrayList.remove("2");
		arrayList.remove(5);
		
		
		//Note that this implementation is not synchronized.
		//To make ArrayList synchronized 
		List<String> syncArrayList = Collections.synchronizedList(arrayList);
		System.out.println("Synchronized ArrayList: " + syncArrayList);
		System.out.println();

		
		
		
		//Iterate through arraylist
		for (int i = 0; i < arrayList.size(); i++) 
		{
			System.out.println(arrayList.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			temp = iterator.next();
			System.out.println(temp);
		}
	}
}
