package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	// create add get search delete replace
	
	public static void main(String[] args) {
		//create
		ArrayList<Integer> arr = new ArrayList<>();
		
		//add
		arr.add(12);
		arr.add(4);
		arr.add(5);
		arr.add(87);
		System.out.println(arr);
		
		//get
		System.out.println(arr.get(2));
		
		//search
		System.out.println(arr.contains(5));
		
		//delete
		System.out.println(arr.remove(1));
		System.out.println(arr);
		
		//replace
		arr.set(1,23);
		System.out.println(arr);
		
		//add in between
		arr.add(1, 10);
		System.out.println(arr);
		
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		//Iterator
		Iterator<Integer> iterator = arr.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
