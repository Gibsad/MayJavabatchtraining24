package javaspkg;

public class contructor01 {
	
	public contructor01(){
		
		System.out.println("default constructor");
		
	}
	
	public contructor01(int a) {
		
		this(20,30);
		System.out.println("one paratermized constructor ");
	}
	
	public contructor01(int a, int b) {
		
		System.out.println("two paratermized constructor");
	}
	
	
	
	public static void main(String args[]) {
		
		contructor01 obj = new contructor01(20);

	
	}

}
