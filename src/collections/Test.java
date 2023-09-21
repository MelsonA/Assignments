package collections;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(23);
		arr.add(435);
		arr.add(77);
		arr.add(64);
		arr.add(3);
		arr.add(8);
		
//		for(String i:arr) {
//			System.out.println(i);
//		}
		
		Iterator<Integer> iterator = arr.iterator();
			
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		arr.add(0,"yellow");
//		System.out.println(arr);
//		
//		System.out.println(arr.get(3));
//			
//		arr.set(1, "blue");
//		System.out.println(arr);
		
//		arr.remove(2);
//		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.addAll(arr);
		
		for(Integer i : arr1) {
			System.out.println(i);
		}
		System.out.println(arr1);
		
		Collections.shuffle(arr1);
		System.out.println(arr1);
		
		Collections.reverse(arr1);
		System.out.println(arr1);
		Collections.swap(arr1, 1, 2);
		System.out.println(arr1);
		
		Collections.disjoint(arr, arr1);
		System.out.println(arr);
		
		ArrayList<Integer> arr3 = new ArrayList<>();
		arr3.add(12);
		arr3.add(1);
		arr3.add(2);
		
		arr3.addAll(arr1);
		System.out.println(arr3);
		
		arr3.clear();
		System.out.println(arr3);
	}

}
