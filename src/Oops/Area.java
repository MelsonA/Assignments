package Oops;

public class Area {
  
	public  int setDim(int l,int b) {
		return l*b;
	}
	
	public void getArea() {
		int area=setDim(5,8);
		System.out.println(area);
	}
	
	public  void rectangle(int l,int b) {
		int area=l*b;
		System.out.println(area);
	}
	
	public static void triangle(int l,int b,int h) {
		int area=l*b*h;
		System.out.println(area);
	}
	public static void main(String[] args) {
		Area area = new Area();
		area.getArea();	
	}
}
