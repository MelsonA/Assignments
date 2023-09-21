
public class JavaDemo {
	public static void main(String[] args) {
	    JavaDemo addition = new JavaDemo();
		int result=addition.add(2, 3);
		int r =result*10;
		System.out.println(r);
		mul(1,3);
		sub(1,3);
	}
	
	public  int add(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	public static void mul(int a,int b) {
		System.out.println(a*b);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
}
