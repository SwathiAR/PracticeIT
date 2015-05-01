import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer , String> hm = new HashMap<Integer , String>();
		Map<Integer , String> lm = new LinkedHashMap<Integer , String>();
		Map<Integer , String> sm = new TreeMap<Integer, String>();

		
		doSomething(hm);
		
	}
	
	
	public static void doSomething(Map<Integer , String> map){
		
		map.put(4, "Swathi");
		map.put(2, "Chethan");
		map.put(1, "Shruthi");
		map.put(3, "Shwetha");
		
		for(Integer key: map.keySet()){
			map.get(key);
		}
		
		System.out.println(map);
		
		
	}

}
