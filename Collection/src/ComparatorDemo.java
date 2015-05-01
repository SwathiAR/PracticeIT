import java.util.ArrayList;
import java.util.Collections;


public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(4);
		al.add(9);
		al.add(2);
		al.add(0);
		al.add(6);
		
		Collections.sort(al, new MyComparator());
		System.out.println(al);
		
	}

}
