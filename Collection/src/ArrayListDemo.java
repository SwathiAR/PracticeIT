import java.util.ArrayList;


public class ArrayListDemo {
	
	public static void main(String[] args){
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(null);
	
	
	for(int i =0; i<al.size(); i++){
		System.out.println(al.get(i));
	}
	
	al.remove(al.size()-1);
	
	for(Integer value : al){
	System.out.println(value);	
	}
	}

}
