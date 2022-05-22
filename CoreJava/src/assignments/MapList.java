package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {

	public static void main(String[] args) {
		Map<Integer, String>map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(5, "d");
		map.put(1, "e");
		
		List<Integer> keyList = new ArrayList(map.keySet());
		List<Integer> valueList = new ArrayList(map.values());
		
		System.out.println("key List: " +keyList);
		System.out.println("value List: " +valueList);

	}

}
