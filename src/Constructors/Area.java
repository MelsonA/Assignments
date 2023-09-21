package Constructors;

public class Area {
	private int l;
	private int b;
	
	public Area(int l,int b) {
		this.l=l;
		this.b=b;
		
	}
	
	public int returnArea() {
		int a=l*b;
		
		return a;
	}
	
	public static void main(String[] args) {
		Area area = new Area(2,4);
		System.out.println(area.returnArea());
		
	}

}
