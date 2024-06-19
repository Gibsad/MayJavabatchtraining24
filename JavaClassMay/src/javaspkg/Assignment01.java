package javaspkg;

//(((((10+2)+2)-2)*2)/2)

//Add 10+2, a+b, c= a+b
//d=c+b, return d

//

public class Assignment01 {
	
	public int method01(int a, int b) {
		
		int c = a+b;
		return c;
		
	}
	
	public int method02(int a, int b) {
		
		int c = a-b;
		return c;
	}
	
	public int method03(int a, int b) {
		
		int c=a*b;
		return c;
	}
	
	public void method04(int a, int b) {
		
		int result = a/b;
		System.out.println("The result is"+result);
	
		
	}
	
	public static void main(String args[]) {
		
		Assignment01 obj = new Assignment01();
		int sum = obj.method01(10, 2);
		int sum1 = obj.method01(sum,2);
		int sub = obj.method02(sum1,2);
		int mul = obj.method03(sub,2);
		obj.method04(mul,2);
		
		
	}
	

}
