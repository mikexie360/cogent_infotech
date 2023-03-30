package Map;

import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		map.put("John", 30);
		map.put("Tom", 30);
		map.put("Lee", 20);
		map.put("Brad", 21);
		map.put("John", 50);
		
		System.out.println(map);
	
		Set<String> keyset = map.keySet();
		System.out.println("Keyset: " + keyset);
	
		Collection<Integer> values = map.values();
		System.out.println("Values: "+ values);
	
		for(String key: keyset) {
			System.out.println("key:" + key + " value:" + map.get(key));
		}
		
	}

}
