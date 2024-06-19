package javaspkg;

public class child2 extends parent2 {
	
	public child2() {
		super(1,2);
		System.out.println("Child default constructor");
	}
	
	public child2(int a) {
		this(1,2);
		System.out.println("Child one parameterized constructor");
	}
	
	public child2(int a, int b) {
		this(1,2,3);
		System.out.println("Child two parameterized constructor");
		
	}
	
	public child2(int a , int b, int c) {
		this();
		System.out.println("Child three parameterized contructor");
	}
	
	
	
	public static void main(String args[]) {
		
		
		child2 obj1 = new child2(1);
		
		
		
	}


}
