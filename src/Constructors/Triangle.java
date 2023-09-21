package Constructors;

public class Triangle {
	
//	private int side1;
//	private int side2;
//	private int side3;
//	
//	public Triangle() {
//		side1=3;
//		side2=4;
//		side3=5;
//	}
//	
//	public int  perimeter() {
//		int p=side1*side2*side3;
//		System.out.println(p);
//		return p;
//	}
//	
//	public int area() {
//		int a=(side2*side3)/2;
//		System.out.println(a);
//		return a;
//	}
//	
//	public static void main(String[] args) {
//		 Triangle triangle = new Triangle();
//		 
//		 int area = triangle.area();
//		 int perimeter = triangle.perimeter();
	
	public Triangle(int l,int b, int h) {
		int p=l*b*h;
		System.out.println(p);
	}
		
	public Triangle(int b, int h) {
		int a= (b*h)/2;
		System.out.println(a);
	}
		 
		 
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3,4,5);
		Triangle triangle1= new Triangle(3,4);
	}
}





















