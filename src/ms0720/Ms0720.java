package ms0720;

import java.util.*;


public class Ms0720 {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(4, "1");
		map.put(3, "3");
		map.put(2, "4");
		Iterator<Integer> keys =  map.keySet().iterator()    ;
		while( keys.hasNext()) {
			Integer key =  keys.next();
			String value =  map.get(key);
			System.out.println(key + "," + value);
		} 
	}

}
