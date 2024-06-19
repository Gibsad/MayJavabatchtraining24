package javaspkg;

public class parent2 {
	
	public parent2() {
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	
	public parent2(int a) {
		this();
		System.out.println("Parent one parameterized constructor");
	}
	
	public parent2(int a, int b) {
		this(1);
		System.out.println("Parent two parameterized constructor");
		
		
	}
	
	public parent2(int a, int b, int c) {
		System.out.println("Parent three parameterized constructor");
	}

}
