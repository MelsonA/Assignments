package Constructors;

public class Rectangle {
	
	private int l;
	private int b;
	
	public Rectangle(int l, int b) {
		this.l=l;
		this.b=b;
	}
	
	public int area() {
		int a=l*b;
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle1=new Rectangle(4,5);
		Rectangle rectangle2=new Rectangle(5,8);
		
		int areas1 = rectangle1.area();
		int areas2= rectangle2.area();
	
	
				
	}

}
