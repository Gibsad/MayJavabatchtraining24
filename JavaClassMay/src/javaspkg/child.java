package javaspkg;

public class child extends parent {
	
	public child() {
		this(1);
		System.out.println("Child default constructor");
	}
	
	public child(int a) {
		this(1,2);
		System.out.println("Child one parameterized constructor");
	}
	
	public child(int a, int b) {
		super(1);
		System.out.println("Child two parameterized constructor");
		
	}
	
	public child(int a , int b, int c) {
		this();
		System.out.println("Child three parameterized contructor");
	}
	
	
	
	public static void main(String args[]) {
		
		
		child obj1 = new child(1,2,3);
		
		
		
	}


}
