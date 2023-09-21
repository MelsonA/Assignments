package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ProblemComparator {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap<Integer,String>(Collections.reverseOrder());
		Map<Integer,String> maps = new HashMap();
		maps.put(100, "john");
		maps.put(50, "peter");
		maps.put(1, "zack");
		maps.put(5, "sam");
		
		List<Map.Entry<Integer, String>> list = new ArrayList<>(maps.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>(){
			@Override
			public int compare(Map.Entry<Integer, String>obj1,Map.Entry<Integer, String>obj2) {
				return obj2.getKey().compareTo(obj1.getKey());
			}
		});
		
		Map<Integer, String> map1 = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, String> entries : list) {
			map1.put(entries.getKey(), entries.getValue());
		}
		System.out.println(map1);
	}
		
		
		

	
	}


