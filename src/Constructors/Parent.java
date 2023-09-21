package Constructors;

public class Parent {
  
  public Parent() {
	  System.out.println("default parent");
  }
  
  private String username;
  
  public Parent(String username) {
	  this.username=username;
	  
  }
  
  public String getUsername() {
	  return username;
  }
  
}
