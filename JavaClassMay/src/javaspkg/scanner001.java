//((((x1+x2)-x3)+x4)*x5)/x6)


package javaspkg;

import java.util.Scanner;

import javaspkg.Assignment01;

public class scanner001 {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
		
	}
	
	public int sub(int a, int b) {
		int c = a-b;
		return c;
		
	}
	
	public int mul(int a, int b) {
		int c = a*b;
		return c;
		
	}
	
	public void div(int a, int b) {
		int result = a/b;
		System.out.println("The result: "+result);
	}
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		int x1 = obj.nextInt();
		
		System.out.println("Enter the value of x2: ");
		int x2 = obj.nextInt();
		
		System.out.println("Enter the value of x3: ");
		int x3 = obj.nextInt();
		
		System.out.println("Enter the value of x4: ");
		int x4 = obj.nextInt();
		
		System.out.println("Enter the value of x5: ");
		int x5 = obj.nextInt();
		
		System.out.println("Enter the value of x6: ");
		int x6 = obj.nextInt();
		
		scanner001 obj2 = new scanner001();
		
		int sum = obj2.add(x1, x2);
		int sub = obj2.sub(sum, x3);
		int sum1 = obj2.add(sub, x4);
		int mult = obj2.mul(sum1, x5);
		obj2.div(mult, x6);
		
	}

}
