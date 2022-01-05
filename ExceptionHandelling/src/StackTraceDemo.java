
public class StackTraceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		method1();
		

	}

	private static void method1() {
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() {
		// TODO Auto-generated method stub
		method3();
	}

	private static void method3() {
		// TODO Auto-generated method stub
		
		throw new ArithmeticException();
	}

}
