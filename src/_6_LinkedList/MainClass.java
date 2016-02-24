package _6_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainClass 
{
	public static void main(String args[])
	{
		
		//ArrayList vs LinkedList
		//linked list is exactly same as ArrayList except few things which are shown below
		
		
		//1) Search: ArrayList search operation is pretty fast compared to the LinkedList search operation. 
		//get(int index) in ArrayList gives the performance of O(1) while LinkedList performance is O(n).

		//Reason: ArrayList maintains index based system for its elements as it uses array data structure implicitly
		//which makes it faster for searching an element in the list. On the other side LinkedList implements doubly 
		//linked list which requires the traversal through all the elements for searching an element.

		//2) Deletion: LinkedList remove operation gives O(1) performance while ArrayList gives variable performance: O(n)
		//in worst case (while removing first element) and O(1) in best case (While removing last element).

		//Conclusion: LinkedList element deletion is faster compared to ArrayList.

		//Reason: LinkedList’s each element maintains two pointers (addresses) which points to the both neighbor 
		//elements in the list. Hence removal only requires change in the pointer location in the two neighbor nodes 
		//(elements) of the node which is going to be removed. While In ArrayList all the elements need to be shifted
		//to fill out the space created by removed element.

		//3) Inserts Performance: LinkedList add method gives O(1) performance while ArrayList gives O(n) in worst case.
		//Reason is same as explained for remove.

		//4) Memory Overhead: ArrayList maintains indexes and element data while LinkedList maintains element data and 
		//two pointers for neighbor nodes hence the memory consumption is high in LinkedList comparatively.

		
		
//		LinkedList is backed by a doubly-linked list, not an array
//		ArrayList is a list backed by an array
		
		
		
		
		
		//When to use LinkedList and when to use ArrayList?
		// 1) As explained above the insert and remove operations give good performance (O(1)) in LinkedList 
		//compared to ArrayList(O(n)). Hence if there is a requirement of frequent addition and deletion in 
		
		//application then LinkedList is a best choice.
		// 2) Search (get method) operations are fast in Arraylist (O(1)) but not in LinkedList (O(n)) 
		//so If there are less add and remove operations and more search operations requirement, 
		//ArrayList would be your best bet.
		
		
		LinkedList<Integer> linkedList = new LinkedList<>();

		//allows null and duplicates
		//retrieves same as insertion order 
		linkedList.add(null);
		linkedList.add(4);
		linkedList.add(3);
		linkedList.add(1);
		linkedList.add(1);
		
		System.out.println("Your ArrayList " + linkedList);

		System.out.println();
		
		//It is not synchronized
		List<Integer> syncLinkedList = Collections.synchronizedList(linkedList);
		System.out.println("Synchronized list: " + syncLinkedList);
		
		System.out.println();
		
		
		//Iteration
		//Defferent from others
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		
		
		
	}
}
