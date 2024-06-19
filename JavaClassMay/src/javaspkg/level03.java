package javaspkg;

public class level03 extends level02 {
	
	public void level3(){
		System.out.println("Child class");
	}
	public static void main(String args[]) {
		
		level03 obj1 = new level03();
		obj1.level3();
		obj1.level1();
		obj1.level2();
	}
	

}
