package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class problem1 {
	public static void main(String[] args) {
//		String str="wwwaabdddd";
//		
//		Map<Character,Integer> map = new LinkedHashMap<>();
//		
//		for(int i=0;i<str.length();i++) {
//			Character c=str.charAt(i);
//			if(map.containsKey(c)) {
//				int val=map.get(c);
//				map.put(c,val+1);
//				
//			}else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);
		
		String str= "wwwaabddddww";
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			char c = str.charAt(i);
			char n = str.charAt(i+1);
			if(c==n) {
				count=count+1;
			}else {
				System.out.print(c+""+count);
				count=1;
			}
		}
		System.out.print(str.charAt(str.length()-1)+""+count );
	  
	}

}
