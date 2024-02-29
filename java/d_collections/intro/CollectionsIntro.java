package d_collections.intro;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class CollectionsIntro {

	static void test1() {
		/* //// Array List //// */
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Subbu");
		arrayList.add("Trump");
		System.out.println(arrayList.get(0));
		
		
		/* //// Array List //// */
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Subbu");
		linkedList.add("Hello");
		System.out.println(linkedList.get(0));
		
		
		/* //// Array List //// */
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Subbu");
		/* //// Array List //// */
		LinkedHashSet<String> linkedHashset = new LinkedHashSet();
		linkedHashset.add("Subbu");
		/* //// Array List //// */
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(23);
		treeSet.add(4);
		System.out.println(treeSet.first());
		
		PriorityQueue priorityQueue=new PriorityQueue();
		priorityQueue.add("apple");
		System.out.println(priorityQueue.peek());
		
		ArrayDeque arrayDeque=new ArrayDeque(); 
		arrayDeque.add("Subbu");
		

	}

	public static void main(String[] args) {
		   String x="Subbu";

	        StringBuilder y=new StringBuilder();
	       String result="";
	        for(int i=x.length()-1;i>=0;i--){
	         y.append(x.charAt(i));
	       }
	     result=y.toString();
	     System.out.println(result);

	}

}
