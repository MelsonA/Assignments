package Constructors;

public class Child extends Parent{
	 	
	private String firstname;
	  
	public Child(String firstname,String lastname) {
		super(lastname);
		this.firstname=firstname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	 
}
