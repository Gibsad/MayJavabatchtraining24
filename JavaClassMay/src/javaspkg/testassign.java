//(10+2)(10-2)


package javaspkg;

public class testassign {
	
	public int method01(int a, int b) {
		int c = a+b;
		System.out.println("The sum is: "+c);
		return c;
		
	}
	
	public int method02(int a1, int b1) {
		
		int c1=a1-b1;
		System.out.println("The sub is: "+c1);
		return c1;
	}
	
	public void method03(int a2, int b2) {
		
		int c2=a2*b2;
	}

	public static void main(String args[]) {
		
		testassign obj = new testassign();
		int sum = obj.method01(10, 2);
		int sub = obj.method02(10, 2);
		int result = sum* sub;
		System.out.println("The result is: "+result);
		
		
		
		
	}

}
