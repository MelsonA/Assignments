package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pctest {
	
	public static void main(String[] args) {
		
		Child child1 = new Child("john","samy");
		Child child2 = new Child("peter" , "sam");
		
		List<Child> childlist = new ArrayList<>();
		childlist.add(child1);
		childlist.add(child2);
		
		
		
		Collections.sort(childlist, new NameComparator());
		System.out.println(childlist);
		
	}

}
