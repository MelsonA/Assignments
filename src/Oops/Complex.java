package Oops;

public class Complex {
	
	private int a;
	private int b;
	
	public void sum(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	
	public void diff(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a-b);
	}
	
	public void product(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		Complex complex = new Complex();
		complex.sum(3,5);
		complex.diff(3,5);
		complex.product(3,5);
	}

}
