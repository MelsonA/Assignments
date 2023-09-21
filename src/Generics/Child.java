package Generics;

public class Child extends Parent implements Comparable<Child>{
	
	String name;
	
	public Child(String name, String username) {
		super(username);
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Child o) {
		
		if(this.getName().length() > o.getName().length()) {
			return 1;
		}else if(this.getName().length() < o.getName().length()) {
			return -1;
		}
		else {
		return 0;
		}
	}
	
	public String toString() {
		return (getName() + " "+getUsername());
	}

}
