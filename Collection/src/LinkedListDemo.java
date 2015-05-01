import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		doSomething("Arraylist" , al);
		System.out.println("---------------------------------------------------");
		doSomething("LinkedList", ll);
		

	}

	public static void doSomething (String type , List<Integer> list){
		long start = System.currentTimeMillis();
		for(int i =0; i<1E5 ; i++){
			list.add(i);
		}
		long end = System.currentTimeMillis();
		
		//System.out.println(list);
		
		System.out.println("Time taken by " + type + (end-start) + "ms");
		
		System.out.println("adding in the beginning" );
		
		long start1 = System.currentTimeMillis(); 
		for(int i=0; i< 1E5 ; i++){
			list.add(0,i);
		}
		long end1 = System.currentTimeMillis();
		//System.out.println(list);
		System.out.println("Time taken by" + type + (end1 - start1) + "ms");
	}
}
