//(((((10*2)-2)+2)-2)/2)

//

package javaspkg;

public class Assignment02 {
	
	public int mul(int a, int b) {
		int c = a*b;
		return c;
	}
	
	public int sub(int a, int b) {
		int c = a-b;
		return c;
		
	}
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
		
	}
	public void div(int a, int b) {
		int c = a/b;
		System.out.println("The result is:"+c);
	}
	
	public static void main(String args[]) {
		
		Assignment02 obj = new Assignment02();
		int mul = obj.mul(10,2);
		int sub = obj.sub(mul,2);
		int add = obj.add(sub,2);
		int sub1 = obj.sub(add,2);
		obj.div(sub1,2);
		
		
		
	}

}
