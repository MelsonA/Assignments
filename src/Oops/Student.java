package Oops;

public class Student {
	
	String name;
	int roll_no;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.name="John";
		student.roll_no=2;
		System.out.println("name is: "+ student.name); 
		System.out.println("roll_no is: "+ student.roll_no); 
	}

}
