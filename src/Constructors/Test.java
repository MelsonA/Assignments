package Constructors;

public class Test {
   public static void main(String[] args) {
	
   //Child child = new Child();
	
   Child child = new Child("john","peter");
   System.out.println(child.getFirstname());
   System.out.println(child.getUsername());
}
}
