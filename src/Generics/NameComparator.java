package Generics;

import java.util.Comparator;

public class NameComparator implements Comparator<Child> {

	@Override
	public int compare(Child o1, Child o2) {
		
		if(o1.getUsername().length() > o2.getUsername().length()) {
			return -1;
		}else if(o1.getUsername().length() < o2.getUsername().length()) {
			return 1;
		}
		else {
		return 0;
		}
	}

}
