package _5_Vector;

public class MainClass 
{
	public static void main(String args[])
	{
		
		//Similarity between Vector and ArrayList
		//1> Both Vector and ArrayList use growable array data structure.
		//2> The iterator and listIterator returned by these classes (Vector and ArrayList) are fail-fast.
		//3> They both are ordered collection classes as they maintain the elements insertion order.
		//4> Vector & ArrayList both allows duplicate and null values.
		//5> They both grows and shrinks automatically when overflow and deletion happens.
		
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
		
		
		
		
		
		
		
	}
}
