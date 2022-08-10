package Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class sorting_Hashmap {

	public static void main(String[] args) {
		
		Map<String,Integer> mp= new HashMap<String,Integer>();
		mp.put("s", 3);
		mp.put("a", 8 );
		mp.put("u", 10);
		mp.put("l", 56);
		mp.put("b", null);
		
		Map<String,Integer> tp= new TreeMap<String,Integer>(mp);
		
	for(Entry<String, Integer> val: tp.entrySet()) {
		
		System.out.println(val);
		
	}
		
		
		
	}

}
