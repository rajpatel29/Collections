package _5_Vector;

import java.util.Iterator;
import java.util.Vector;

public class MainClass 
{
	public static void main(String args[])
	{
		
		//Vector proves to be very useful if you don't know the size of the array in advance or you just need one
		//that can change sizes over the lifetime of a program.
		
		
		//Similarity between Vector and ArrayList
		//Vector is exactly same as ArrayList except for few things which is shown below
		
		
		//Difference
		//1) Synchronization: ArrayList is non-synchronized which means multiple threads can work on ArrayList
		//at the same time. For e.g. if one thread is performing an add operation on ArrayList, there can be an
		//another thread performing remove operation on ArrayList at the same time in a multithreaded environment
		//while Vector is synchronized. This means if one thread is working on Vector, no other thread can get a
		//hold of it. Unlike ArrayList, only one thread can perform an operation on vector at a time.

		//2) Resize: Both ArrayList and Vector can grow and shrink dynamically to maintain the optimal use of storage,
		//however the way they resized is different. ArrayList grow by half of its size when resized while Vector doubles
		//the size of itself by default when grows.

		//3) Performance: ArrayList gives better performance as it is non-synchronized. Vector operations gives poor 
		//performance as they are thread-safe, the thread which works on Vector gets a lock on it which makes other
		//thread wait till the lock is released.
		
		
		
		
		
		//Initial capacity of the vector is 3 and it will increment by 2
		Vector<Integer> vector = new Vector<>(3,5);
		System.out.println("Size of the vector " + vector.size());
		System.out.println("Capacity of the vector " + vector.capacity());
		
		vector.add(1);
		vector.add(2);
		vector.add(1);
		vector.add(5);
		vector.add(5);
		
		System.out.println("After adding 3 Size of the vector " + vector.size());
		System.out.println("After adding 3 Capacity of the vector " + vector.capacity());
		

		
		vector.addElement(4);
		
		System.out.println("After adding 4 Size of the vector " + vector.size());
		System.out.println("After adding 4 Capacity of the vector " + vector.capacity());
		
		System.out.println("Your vector " + vector);
		
		
		
		//It is synchronized
		
		
		//Iterating through vector
		System.out.println("Iterating through vector");
		Iterator iterator = vector.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
}
