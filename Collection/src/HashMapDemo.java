import java.util.HashMap;
import java.util.Map;



public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer , String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(1, "ONE");
		hm.put(2, "TWO");
		
		for(Map.Entry<Integer , String> entry : hm.entrySet()){
			
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
			
		}


	}

}
