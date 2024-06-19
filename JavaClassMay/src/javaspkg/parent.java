package javaspkg;

public class parent {
	
	public parent() {
		this(1,2);
		System.out.println("Parent default constructor");
	}
	
	public parent(int a) {
		this(1,2,3);
		System.out.println("Parent one parameterized constructor");
	}
	
	public parent(int a, int b) {
		System.out.println("Parent two parameterized constructor");
		
		
	}
	
	public parent(int a, int b, int c) {
		this();
		System.out.println("Parent three parameterized constructor");
	}

}
