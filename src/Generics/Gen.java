package Generics;

public class Gen <T extends Number>  {

	private T name;
	
	public Gen(T name) {
		this .name =name;
	}
	
	public T getName() {
		return name;
	}
}
