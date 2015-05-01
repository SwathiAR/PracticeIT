import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<String>();
		Set<String> linkedhs = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		
		doSomething(hashset);
		System.out.println("-----------------");
		doSomething(linkedhs);
		System.out.println("-----------------");
		doSomething(treeSet);

	}
	
	public static void doSomething(Set<String> set){
		
		if(set.isEmpty()){
			System.out.println("Its empty. Lets add elements");
		}
		
		set.add("Swathi");
		set.add("Dwathi");
		
		set.add("Twathi");
		
		set.add("Jwathi");
		
		set.add("Kwathi");
		
		System.out.println(set);
		
		for(String element :set){
			System.out.println(element);
			
		}
		
		if(set.contains("Swathi")){
			System.out.println("Contains me");
		}
		
	}

}
