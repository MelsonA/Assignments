package Generics;

public class Test {
	public static void main(String[] args) {
		
		Gen gen = new Gen(1);
		Gen<Integer> gen1 = new Gen(1000);
		System.out.println(gen1.getName().getClass());
		System.out.println(gen.getName().getClass());
	}
	
	
	
	

}
